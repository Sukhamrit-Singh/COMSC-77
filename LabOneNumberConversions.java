//  Sukhamrit Singh
//  Number Conversion
/*
This is a program where you would enter a number
(binary, octal, hex, or decimal), and it would convert
it to the other three forms of the number entered.  The user first enters
the number, and then enters the type of number.  Then it displays
results.
 */


import java.util.Scanner;


public class LabOneNumberConversions {
    public static void main(String[] args) {

        boolean run = true;
        while ( run ) {

            Scanner input = new Scanner(System.in);

            // Get number
            System.out.print("Please enter a number: ");
            String numberString = input.nextLine();

            // Get number Base
            System.out.print("\nPlease enter the Base " +
                    "(Binary = 2, Octal = 8, Hexadecimal = 16, " +
                    "Decimal = 10, Exit = 0): ");

            String base = input.nextLine();
            int type = 0;
            try {
                type = Integer.parseInt(base);

            } catch(NumberFormatException e)  {

                // If invalid Base, then start over
                System.out.println("  Invalid Base ... "+base);
                System.out.println("");

                continue;
            }
            System.out.println("");


            // Handle Exit
            if ( type == 0 ) {

                run = false;
            }

            // Handle Binary
            else if (type == 2) {

                try {

                    int num = Integer.parseInt(numberString, 2);

                    System.out.println(numberString + " Base("+type+") is:");

                    binaryToOctal(numberString);
                    binaryToHex(numberString);
                    binaryToDecimal(numberString);

                }  catch(NumberFormatException e)  {
                    System.out.println("  Invalid Binary Number ... "+numberString);
                }
            }

            // Handle Octal
            else if (type == 8) {

                try {

                    int num = Integer.parseInt(numberString, 8);

                    System.out.println(numberString + " Base("+type+") is:");

                    octalToBinary(numberString);
                    octalToHex(numberString);
                    octalToDecimal(numberString);

                }  catch(NumberFormatException e)  {
                    System.out.println("  Invalid Octal Number ... "+numberString);
                }

            }

            // Handle Hexadecimal
            else if (type == 16) {

                try {

                    int num = Integer.parseInt(numberString, 16);

                    System.out.println(numberString + " Base("+type+") is:");

                    hexToBinary(numberString);
                    hexToOctal(numberString);
                    hexToDecimal(numberString);

                }  catch(NumberFormatException e)  {
                    System.out.println("  Invalid Hexadecimal Number ... "+numberString);
                }

            }

            // Handle Decimal
            else if (type == 10) {

                try {

                    int num = Integer.parseInt(numberString, 10);

                    System.out.println(numberString + " Base("+type+") is:");

                    decimalToBinary(numberString);
                    decimalToOctal(numberString);
                    decimalToHex(numberString);

                }  catch(NumberFormatException e)  {
                    System.out.println("  Invalid Decimal Number ... "+numberString);
                }

            }

            // Unsupported Base
            else {
                System.out.println("  Base not supported");
            }

            System.out.println("");
        }
    }

    /*
        Convert Binary to Octal
    */
    public static void binaryToOctal (String number) {

        int decNum = Integer.parseInt(number, 2);
        String octNum = Integer.toString(decNum, 8);
        System.out.println("  Octal: "+octNum);
    }

    /*
        Convert Binary to Hexadecimal
    */
    public static void binaryToHex (String number) {

        int decNum = Integer.parseInt(number, 2);
        String hexNum = Integer.toString(decNum, 16);
        System.out.println("  Hexadecimal: "+hexNum);
    }

    /*
        Convert Binary to Decimal
    */
    public static void binaryToDecimal (String number) {

        int decNum = Integer.parseInt(number, 2);
        System.out.println("  Decimal: "+decNum);
    }

    /*
        Convert Octal to Binary
    */
    public static void octalToBinary (String number) {

        int decNum = Integer.parseInt(number, 8);
        String binNum = Integer.toString(decNum, 2);
        System.out.println("  Binary: "+binNum);
    }

    /*
        Convert Octal to Hexadecimal
    */
    public static void octalToHex (String number) {

        int decNum = Integer.parseInt(number, 8);
        String hexNum = Integer.toString(decNum, 16);
        System.out.println("  Hexadecimal: "+hexNum);
    }

    /*
        Convert Octal to Decimal
    */
    public static void octalToDecimal (String number) {

        int decNum = Integer.parseInt(number, 8);
        System.out.println("  Decimal: "+decNum);
    }


    /*
        Convert Hexadecimal to Binary
    */
    public static void hexToBinary (String number) {

        int decNum = Integer.parseInt(number, 16);
        String binNum = Integer.toString(decNum, 2);
        System.out.println("  Binary: "+binNum);
    }

    /*
        Convert Hexadecimal to Octal
    */
    public static void hexToOctal (String number) {

        int decNum = Integer.parseInt(number, 16);
        String octNum = Integer.toString(decNum, 8);
        System.out.println("  Octal: "+octNum);
    }

    /*
        Convert Hexadecimal to Decimal
    */
    public static void hexToDecimal (String number) {

        int decNum = Integer.parseInt(number, 16);
        System.out.println("  Decimal: "+decNum);
    }


    /*
        Convert Decimal to Binary
    */
    public static void decimalToBinary (String number) {

        int decNum = Integer.parseInt(number, 10);
        String binNum = Integer.toString(decNum, 2);
        System.out.println("  Binary: "+binNum);
    }

    /*
        Convert Decimal to Octal
    */
    public static void decimalToOctal (String number) {

        int decNum = Integer.parseInt(number, 10);
        String octNum = Integer.toString(decNum, 8);
        System.out.println("  Octal: "+octNum);
    }

    /*
        Convert Decimal to Hexadecimal
    */
    public static void decimalToHex (String number) {

        int decNum = Integer.parseInt(number, 10);
        String hexNum = Integer.toString(decNum, 16);
        System.out.println("  Hexadecimal: "+hexNum);
    }
}

