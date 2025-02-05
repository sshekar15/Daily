
import java.util.Scanner;
class Doit {
  public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int pos = 0;

     do{
        System.out.print("Enter a positive number: ");
        pos = scanner.nextInt();
        if (pos <0){
        System.out.println("That not right! Invalid input.Try again!");
        }
     }
    while (pos < 0);
        
      System.out.println("Yay! Valid input.");
          scanner.close();
  }

}
