import java.util.Random;
import java.util.Scanner;
class GuessNumber {
  public static void main(String[] args) {
    Random rand = new Random();
    int ran1 = rand.nextInt(100);
    int counter = 0;
    System.out.println("Guess a magic number between 0 and 100");
    
    Scanner scanner = new Scanner(System.in);  
    
    while (true){
        System.out.print("Enter your guess:");
        int guess = scanner.nextInt();
        counter = counter + 1;
        if (guess == ran1){
            System.out.println("Wow you guessed the right message in "+ counter+" attempts!");
            break;
        }
        else if (guess > ran1){
            System.out.println("You guessed too high!");
            System.out.println("");
        }
        else{
            System.out.println("You guessed too low!");
            System.out.println("");
        }
        
    }
    scanner.close();
  }}
