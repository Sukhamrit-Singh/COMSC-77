import java.util.Scanner;

public class ExecutionTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please type in the instruction count.  " +
                "With a space, please add the CPI.  " +
                "Again with a space, add the clock time.  " +
                "Finally with a space, add the Reference Time");


        double count = input.nextDouble();
        double cpi = input.nextDouble();
        double cycle = input.nextDouble();
        double spec = input.nextDouble();

        printTable(count, cpi, cycle, spec);

    }

    private static void printTable (double string1, double string2,
                                    double string3, double spec) {
        System.out.println("--------- " + "--------- " + "--------- " + "--------- " + "--------- " + " ---------");
        double exTime = string1 * string2 * string3;

        double refTime = spec/exTime;

        System.out.print(string1);
        System.out.print("   ");
        System.out.print(string2);
        System.out.print("         ");
        System.out.print(string3);
        System.out.print("   ");
        System.out.printf("%.2f", exTime);
        System.out.print("   ");
        System.out.printf("%.2f", spec);
        System.out.print("   ");
        System.out.print(refTime);

        System.out.println("\nExecution time is " + exTime);

        System.out.println("SPECratio is " + refTime);

    }

}
