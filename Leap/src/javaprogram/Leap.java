//Leap year program
package javaprogram;

public class Leap {
    public static void main(String[] args) {
        int year = 2012;
        if( year>=1582) {

            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
          else {
            System.out.println(" Please enter greater year than 1582.");
        }

}
    }

