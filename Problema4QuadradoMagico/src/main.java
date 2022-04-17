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

            boolean validate = validateData(numbers);
            reader.close();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());

        }







    }

    public void magicSquare(int[][]square){

    }


    public static int[] convertToIntArray(String[] stringArray) {
        int[]numberArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            int number = Integer.parseInt(stringArray[i]);
            numberArray[i] = number;
        }
        return numberArray;

    }

    public static Boolean validateData(int[] numbers){
        final int[] validateNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        for (int value:numbers) {
            if (!(intInArray(validateNumbers, value)))return false;
        }
    return  true;
    }

    public static boolean intInArray(int[] array, int number){
        for (int value: array) { if(value == number) return true;}
        return false;
    }
}
