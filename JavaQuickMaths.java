// Import necessary classes
import java.util.Scanner;

public class JavaQuickMaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double i = 1.0;
        System.out.print("Looping from 1.0 to 5.0 with rounding methods:\n");
        while (i <= 5.0){
            System.out.print("Number:" + i + " ");
            i = i + 0.5;
            System.out.print("Ceil: "+ Math.ceil(i) + " ");
            System.out.print("Floor: " + Math.floor(i) + " ");
            System.out.print("Rint: " + Math.rint(i) + " ");
            System.out.print("Round: " + Math.round(i) + " \n");
        }
        System.out.println("");
        
        System.out.print("Enter a decimal number: ");
        double num = scanner.nextDouble();
        System.out.print("Ceil: "+ Math.ceil(num) + " ");
        System.out.print("Floor: " + Math.floor(num) + " ");
        System.out.print("Rint: " + Math.rint(num) + " ");
        System.out.print("Round: " + Math.round(num) + " \n");

        System.out.println("");
        System.out.print("Enter an integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter an word: ");
        String word = scanner.next();
        System.out.println("You entered integer: "+ num2);
        System.out.println("You entered string: "+ word);


        System.out.println("");
        double intnum = num2;
        int doubum = (int)Math.round(num);
        char c = (char)(doubum);
        System.out.println("Implicit cast (int → double): " + intnum);
        System.out.println("Explicit cast (double → int):" + doubum);
        System.out.println("Casting int to char (ASCII):" + c);
        
        System.out.println("")
        System.out.print("Enter a character:");
        String chara1 = scanner.next();
        int asc = (int)chara1.charAt(0);
        System.out.println("ASCII value of '"+chara1+"' is: " + asc);

         
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");

        System.out.println("String Comparisons:");
        System.out.printf("str1 == str2: %b%n ",str1 == str2);
        System.out.printf("str1 == str2:%b%n ",str1 == str3);
        System.out.print("str1.equals(str3):"+ str1.equals(str3));
        scanner.close(); 
    }
    
}
