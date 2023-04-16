package my.uum;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MySkill extends MineralWater
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        double amount = 0.0;
        int bottle = 0;
        MySkill calculation = new MySkill();

        do{
            System.out.println( "PLease choose an option" );
            System.out.println( "1. Enter Amount" );
            System.out.println( "2. Enter Bottle" );
            System.out.println( "0. Exit" );

            number = scan.nextInt();

            if (number == 1) {
                System.out.print( "1. Enter Amount (RM): " );
                amount = scan.nextInt();
                System.out.println( "Amount (RM): " + amount);
                calculation.calculateAmount(amount);

            } else if (number == 2) {
                System.out.print( "1. Enter number of bottle: ");
                bottle = scan.nextInt();
                System.out.println( "Quality (bottles): " + bottle);
                calculation.calculateBottle(bottle);

            } else if (number == 0) {
                break;
            } else if (number > 3) {
                System.out.println( "Try another option.");
            }

        }while(number > 0 );

    }

}
