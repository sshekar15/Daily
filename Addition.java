import java.util.Random;
import java.util.Scanner;

public class Addition{
  
    public static void main(String args[])
    {   
        Random rand = new Random();
        int ran1 = rand.nextInt(9);
        int ran2 = rand.nextInt(9);

    Scanner scanner = new Scanner(System.in);  
    System.out.print("What is "+ ran1 + " + "+ran2+"? ");
    int sum = scanner.nextInt();
    
    while(sum != ran1 + ran2){
        System.out.print("Wrong answer. Try again. What is "+ ran1 + " + "+ran2+"? ");
        sum = scanner.nextInt();
    }
    System.out.println("You got it!");
    scanner.close();
    }}
