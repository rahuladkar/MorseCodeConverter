package Morse_Code_Converter;

import java.util.Scanner;

public class MorseConverterDriver {

    public static void main(String[] args) {

        String output = "";

        Scanner ip = new Scanner(System.in);

        System.out.println("\n============================== Morse Code Converter ==============================\n");
        System.out.print("\n\tEnter the Characters : ");
        String str1 = ip.nextLine();
        String str = str1.toUpperCase();

        for (int i = 0 ; i < str.length() ; i++){

            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){

                output += MorseConverter.getCharMorseCode()[((int)ch)-65];
            }
            else if (ch >= '0' && ch<= '9'){
                output += MorseConverter.getNumMorseCode()[((int)ch)-48];
            }
            else {
                System.out.println("Wrong input...!");
            }

        }

        System.out.println("\n\tThe Morse Code of " + str1 + " is : "  + output);

    }

}
