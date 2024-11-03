
package serive;

import java.util.Scanner;



public class GetNumberFromKeyboard {
        public static void main(String[] text){
            System.out.print("Please input your number:");
            
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.print("Your number is " + number);
            
        }
}
