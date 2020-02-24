//  Sukhamrit Singh
//  Floating Point Numbers
/*
This is a program using any language that converts a floating point number
to the simple model of the floating point representation.  It asks a
user for a number and then using radix, I was able to get the sign,
exponent, and significand of the number
 */


//  Imports the necessary libraries
import java.util.Scanner;

public class LabTwoFloatingPointNumbers {

    public static void main(String[] args) {

        //  Keep the program running
        boolean run = true;
        while ( run ) {

            Scanner input = new Scanner(System.in);

            // Get number
            System.out.print("Please enter Floating Point number: ");
            String numberString = input.nextLine();


            //  Check if the input is a floating point number
            try {

                int num = Integer.parseInt(numberString, 10);

                floatingPointRep(numberString);


            }  catch(NumberFormatException e)  {
                System.out.println("  Invalid Floating Point Number ... "+numberString);
            }


            System.out.println("");
        }
    }

    /*
        Convert to Floating Point Representation
        1 bit for sign
        5 bits for Exponent
        8 bits for Significand
    */
    public static void floatingPointRep (String number) {

        int expBitLen = 5;
        int sigBitLen = 8;

        String signBit = "0";
        int decNum = Integer.parseInt(number, 10);

        if ( decNum < 0 ) {
            signBit = "1";
            decNum = decNum * -1;
        }

        String binNum = Integer.toString(decNum, 2);

        int exponent = binNum.length();

        String expString = Integer.toString(exponent, 2);

        // 5 bits for exponent
        int len = expString.length();
        int bitDiff = expBitLen-len;
        String zerobits = "";
        for (int i=0; i<bitDiff; ++i) {
            zerobits = zerobits.concat("0");
        }
        String exBits = zerobits.concat(expString);

        // 8 bits for significand
        len = binNum.length();
        bitDiff = sigBitLen-len;
        zerobits = "";
        String sigBits = "";
        if ( bitDiff > 0 ) {
            for (int i=0; i<bitDiff; ++i) {
                zerobits = zerobits.concat("0");
            }
            sigBits = binNum.concat(zerobits);

        } else {
            sigBits = binNum.substring(0, sigBitLen);
        }
        System.out.println("");
        System.out.println("  Floating Point Number        : "+number);
        System.out.println("  Floating Point Representation: "+signBit +" | "+exBits +" | "+sigBits);
    }


}
