
import java.util.Scanner;
import java.util.Random;
class ArrayWeGo {
        public static void array1() {
            System.out.print("Declare an Array:");
            System.out.println("");
            int[] anArray;
            anArray = new int[5];
            System.out.println("Value 1:" + anArray[0] + ", Value 2:" + anArray[1] + ", Value 3:" + anArray[2] + ", Value 4:" + anArray[3] + ", Value 5:" + anArray[4]);
        }
        public static void array2() {
            int[] anArray;
            anArray = new int[5];
            System.out.println("Declare an Array and fill the values in multiple lines:");
            anArray[0] = 21;
            anArray[1] = 12;
            anArray[2] = 22;
            anArray[3] = 11;
            anArray[4] = 2;
            System.out.println("Complete array: " + anArray[0] +", " + anArray[1] +", " +  anArray[2] +", " +  anArray[3] +", " +  anArray[4]);
        }
         public static void array3() {
             System.out.println("Declare an Array and fill the values in one line;");
            int[] anArray = {21,12,22,11,2};
            System.out.println("Complete array: " + anArray[0] +", " + anArray[1] +", " +  anArray[2] +", " +  anArray[3] +", " +  anArray[4]);
        }
        public static void array4() {
            System.out.println("Declare an Array and fill the values using a for loop");
            int[] anArray = new int[5];
            for (int i = 1; i <= 5;i++){
                anArray[i-1] = 3 * i;
            }
            System.out.println("Complete array: " + anArray[0] +", " + anArray[1] +", " +  anArray[2] +", " +  anArray[3] +", " +  anArray[4]);
        }
         public static void array5() {
            System.out.println("Declare an Array and fill the values using a for loop, char edition:");
            char[] charArray  = new char[5];
             charArray[0] = 'A';
             int x = 65;
             for (int i = 1; i < 5; i++ ){
                 x = x + 2;
                char c=(char)x;  
                charArray[i] = c;
             }
             System.out.println("Complete array: " + charArray[0] +", " + charArray[1] +", " +  charArray[2] +", " +  charArray[3] +", " +  charArray[4]);
            
         }
         public static void array6() {
          System.out.println("User-Defined Array with Random Values");
          Scanner scanner = new Scanner(System.in);  
          System.out.print("Enter the size of the array:");
          int size = scanner.nextInt();
         int[] anArray = new int[size];
         Random rand = new Random();
         System.out.println("Complete array: ");
         for (int i = 1; i <= size;i++){
            int rannum = rand.nextInt(100);
             anArray[i-1] = rannum;
             System.out.print(anArray[i-1] + " ");
         }
         scanner.close();
         }
         
         
        public static void main(String[] args) {
        array1();
        System.out.println("");
        System.out.println("");
        array2();
        System.out.println("");
        System.out.println("");
        array3();
        System.out.println("");
        System.out.println("");
        array4();
        System.out.println("");
        System.out.println("");
        array5();
        System.out.println("");
        System.out.println("");
        array6();
    }
}
