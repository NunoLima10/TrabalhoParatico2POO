import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o texto:  ");
        String  text = in.nextLine();

        text = rotateText(text);

        System.out.print("O texto encriptado: ");
        System.out.println(text);

    }

    public static String rotateText(String text){
        text = text.toLowerCase();

        char [] charArray = text.toCharArray();
        char [] newCharArray =  new char[text.length()];

        for (int i = 0; i < charArray.length ; i++) {
            newCharArray[i] = rotateChar(charArray[i]);
        }
        return new String(newCharArray);
    }

    public static char rotateChar(char letter){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int size = alphabet.length();
        int rotate = 13;

        int index = alphabet.indexOf(letter);
        if (index == -1) return ' ';

        int newIndex  = index + 1 + rotate;
        if (newIndex == size) return alphabet.charAt(newIndex - 1);

        newIndex = (newIndex > size) ? (newIndex - size - 1 ) : newIndex - 1;

        return alphabet.charAt(newIndex);
        }

    }


