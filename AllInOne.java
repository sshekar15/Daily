import java.util.Scanner;
public class AllInOne  {

    public static int sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static int max(int num1, int num2, int num3) {
        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static int min(int num1, int num2, int num3) {
        int min = num1;
        if (num2 < min) {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        return min;
    }

    public static double average(int num1, int num2, int num3) {
        int sum1 = sum(num1, num2, num3);
        double average1= sum1 / 3.0; 
        return average1;
    }

    public static boolean pos(int num1, int num2, int num3) {
         boolean pos1 = num1 > 0 && num2 > 0 && num3 > 0;
         return pos1;
    }

    public static void processNumbers(int num1, int num2, int num3) {
        int sum1 = sum(num1, num2, num3);
        int max1 = max(num1, num2, num3);
        int min1 = min(num1, num2, num3);
        double average1 = average(num1, num2, num3);
        boolean Pos = pos(num1, num2, num3);

        System.out.println("Sum: " + sum1);
        System.out.println("Max: " + max1);
        System.out.println("Min: " + min1);
        System.out.println("Average: " + average1);
        System.out.println("All numbers are positive: " + Pos);
        System.out.println("Formatted Output: The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum1 + ".");
    }
    public static void getUserInput(){
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number:");
        int num3 = scanner.nextInt();
        processNumbers(num1, num2,num3);
    }

    public static void main(String[] args) {
        getUserInput();

    }
}
