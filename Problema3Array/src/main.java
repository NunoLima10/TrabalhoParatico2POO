import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class main {
    public static void main(String[] args) {

        ArrayList<Integer> array = generateRandomArray(10,0,100);

        ArrayList<Integer> evenIndexArray = evenIndex(array);
        ArrayList<Integer> evenArray = evens(array);
        ArrayList<Integer> reverseArray = reverse(array);

        ArrayList<Integer> firstsAndLast = new ArrayList<>();
        firstsAndLast.add(array.get(0));
        firstsAndLast.add(array.get((array.size() - 1)));

        String line0 = arrayToString( array ) +"Array\n";
        String line1 = arrayToString( evenIndexArray ) +"evenIndexArray\n";
        String line2 = arrayToString( evenArray ) +"evenArray\n";
        String line3 = arrayToString( reverseArray ) + "reverseArray\n";
        String line4 = arrayToString( firstsAndLast ) + "firstsAndLast\n";

        try {
            FileWriter writer = new FileWriter("Problema3Array/src/output.txt");

            writer.write(line0);
            writer.write(line1);
            writer.write(line2);
            writer.write(line3);
            writer.write(line4);

            writer.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    public static ArrayList<Integer> generateRandomArray(int size, int minValue, int maxValue) {
        Random random = new Random();
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            array.add(random.nextInt(minValue, maxValue));
        }
        return array;
    }

    public static ArrayList<Integer> evenIndex(ArrayList<Integer> array) {
        ArrayList<Integer> newArray =  new ArrayList<>();

        for (int i = 1; i <= array.size(); i++) {
            if(i % 2 == 0) newArray.add(array.get(i - 1));
        }
        return newArray;

    }

    public static ArrayList<Integer> evens(ArrayList<Integer> array) {
        ArrayList<Integer> newArray =  new ArrayList<>();

        for (int value : array) {
            if (value % 2 == 0) newArray.add(value);
        }
        return newArray;
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> array) {

        ArrayList<Integer> newArray = new ArrayList<>(array);

        Collections.reverse(newArray);
        return newArray;
    }

    public static String arrayToString(ArrayList<Integer> array){
        StringBuilder text = new StringBuilder();

        for (Integer value : array) {
            String numberText = value.toString();
            text.append(numberText).append(" ");
        }
        return text.toString();
    }

}
