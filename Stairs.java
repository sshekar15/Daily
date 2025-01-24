import java.util.Scanner;
class Stairs { 
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner chara = new Scanner(System.in);  
        System.out.println("Enter a character:");
        String chara1=chara.next();
        
        Scanner num = new Scanner(System.in);  
        System.out.println("Enter number of steps:");
        int number = num.nextInt();
        
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number-i; j++) {
                System.out.print("  ");
            }
                for (int x = 1; x <= i; x++) {
                System.out.print(" " + chara1);
                }
            System.out.println();
                }

    
            }
    
}
