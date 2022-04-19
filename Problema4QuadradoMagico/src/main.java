import java.io.File;

import java.util.Scanner;


public class main {
    public static void main(String[] args){

        try {
            File file = new File("Problema4QuadradoMagico/src/numbers.txt");
            Scanner reader = new Scanner(file);
            String lineText = reader.nextLine();

            String [] stringArray = lineText.split(",");
            int[] numbers = convertToIntArray(stringArray);

            int n = 4;
            int [][] matrix = buildMatrix(numbers, n);

            boolean validate = validateData(numbers,n);

            if (validate){
                boolean result = magicSquare(matrix, n);

                if(result){
                    System.out.println("O quadrado é magico");
                }else {
                    System.out.println("O quadrado  não é magico");
                }
            }else {
                System.out.println("Os dados não são validos");
            }

            reader.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());

        }

    }

    public static boolean magicSquare(int[][]matrix, int n) {
        int[] result = new int[n * 2 + 2];
        int index = 0;
        int sumMainDiagonal = 0;
        int sumSecondaryDiagonal = 0;

        for (int i = 0; i < n; i++) {
            int sumLine = 0;
            int sumColumns = 0;

            for (int j = 0; j < n; j++) {

                sumLine += matrix[i][j];
                sumColumns += matrix[j][i];

                if (i==0){
                    // first line corners
                    if(j == 0){ sumMainDiagonal += matrix[i][j];}
                    if(j == n - 1){ sumSecondaryDiagonal += matrix[i][j];}
                }
                if((i == j) && (i != 0) && (i != n - 1)){
                    sumMainDiagonal += matrix[i][j];
                    sumSecondaryDiagonal += matrix[i][j];
                }
                if (i == n-1){
                    // last line corners
                    if(j == n - 1){sumMainDiagonal += matrix[i][j];}
                    if(j == 0){ sumSecondaryDiagonal += matrix[i][j];}

                }
            }
            result[index] = sumLine;
            result[index + 1] = sumColumns;
            index += 2;

        }
        result[index] = sumMainDiagonal;
        result[index + 1] = sumSecondaryDiagonal;

        for (int i = 0; i < result.length - 1; i++) {
            if(result[i] != result[i +1]){return false;}
        }
        return true;
    }


    public static int[] convertToIntArray(String[] stringArray) {
        int[]numberArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);
            numberArray[i] = number;
        }
        return numberArray;

    }

    public static int [][] buildMatrix(int[]array, int n){
        int[][] matrix = new int[n][n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = array[index];
                index++;
            }
        }
        return matrix;
    }

    public static Boolean validateData(int[] numbers, int n){
        int nPowTow = (int) Math.pow(n, 2);
        int [] validateNumbers = new int[nPowTow];

        for (int i = 0; i < nPowTow; i++) {
            validateNumbers[i] = i + 1;
        }
        for (int value:numbers) {
            if (!(intInArray(validateNumbers, value)))return false;
        }
    return  true;
    }

    public static boolean intInArray(int[] array, int number){
        for (int value : array) { if(value == number) return true;}
        return false;
    }
}
