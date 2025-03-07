
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;  

  

  

public class megaMillions{  

    static Scanner scanner = new Scanner(System.in);  

    static Random random = new Random();  

    static double balance;  

    static double totalWinnings = 0;  

    static double totalSpent = 0;  

  

  

  

    public static void main(String[] args) {  

        initializeGame();  
        // TODO: Run the game loop until the player can no longer play  

        runGame();  
        //printGameSummary();  

    }

  

        // TODO: Initialize the game (set balance, print welcome message)  

    public static void initializeGame(){  

        balance = 50.00;  

        System.out.println("WELCOME TO MEGA MILLION!");  

        System.out.println("================================");  

        System.out.println("You start with $ 50.00.");  

        System.out.println("");  

        System.out.println("-------------------------------");  



    }  

  

  

  

    // TODO: Run the game loop (handle multiple rounds of play)  

  

    public static void runGame(){  

        boolean start = true;  

        while (start == true){ 

            System.out.printf("\nCurrent Balance: $%.2f\n", balance); 

                System.out.println("-------------------------------");  

                int[] userArray = playRound();  

                int[] winningNumbers = generateNumbers(); 

                boolean wanted = yesmega(balance); 

                double mega = getRandomMegaplier(wanted);  

            System.out.println("================================"); 

            System.out.println("WINNING NUMBERS:");  

            System.out.println("================================");  

            drawingWinning(userArray, winningNumbers); 

            System.out.println(""); 

            System.out.println("Megaplier Drawn: x"+mega); 

            System.out.println("================================");  

            int matches = countMatches(userArray,winningNumbers); 

            boolean jackpot = megaball(userArray,winningNumbers);
            System.out.println("================================"); 

            double prize = prizeAmount(matches,jackpot);

            System.out.println("You won: $" + prize);

            System.out.println(""); 

            double[] totalsummary = new double[3];
            totalsummary= updateBalance(wanted,balance,prize,mega,totalWinnings,totalSpent);
            balance = totalsummary[0];
            totalSpent = totalsummary[1];
            totalWinnings =totalsummary[2];

            System.out.println("New Balance: $" + balance); 
            System.out.println("");

            start = playAgain(balance);


        }  
        printGameSummary(balance, totalSpent, totalWinnings);
        

    } 

  
    public static void printGameSummary(double balance,double totalSpent, double totalWinnings ){
        System.out.println("================================");
        System.out.println("GAME OVER");
        System.out.println("================================");
        System.out.printf("\nTotal Spent: $%.2f\n", totalSpent); 
        System.out.printf("\nTotal Winnings: $%.2f\n", totalWinnings);
        System.out.printf("\nTotal Balance: $%.2f\n", balance); 
        System.out.println("================================");
    }
  

    // TODO: Play one round (handle number selection, ticket purchase, drawing numbers, checking results, updating balance)  

    public static boolean playAgain(double balance){ 
        boolean start = false;
        if (balance > 2.0){
        System.out.println("Do you want to play again? (yes or no): ");
        String input =  scanner.nextLine().toLowerCase();  
            if (input.equalsIgnoreCase("yes")){  
                start = true;
            }
            else{
                start= false;
            }
        }
        return start;
    }
  

  

    public static int[] playRound(){ 

        int winning[];  

        winning = new int[6];  

        System.out.println("Do you want Quick Pick? (yes/no):");  

        String quickpick =  scanner.nextLine().toLowerCase();  

        if (quickpick.equalsIgnoreCase("yes")){  

            winning = generateNumbers();  

            System.out.print("Your Quick Pick: [");  

            for (int i = 0; i < winning.length-1; i++){  

                System.out.print(winning[i] + " ");  

            }  

            System.out.print("] ");  

            int megaball = random.nextInt(1,27);  

            winning[5] = megaball;  

            System.out.println("Mega Ball: " + megaball);  


        }  

  

        else if (quickpick.equalsIgnoreCase("no")){  

            winning = getValidNumber();  

          

            System.out.println(""); 

            System.out.print("Your numbers are: [");  

            for (int i = 0; i < winning.length-1; i++){  

                System.out.print(winning[i] + " ");  

            }  

            System.out.print("] ");  

            System.out.println("Mega Ball: " + winning[5]);  

                return winning;  

    } 

    return winning;  

    } 

  

    public static boolean yesmega(double balance){ 

        System.out.println(""); 

        System.out.println("Do you want to add Megaplier for $1? (yes/no)");
        boolean valid = false; 

        String megaplier = scanner.nextLine().toLowerCase();  
        if(balance > 3.0){
        valid = megaplier.equalsIgnoreCase("yes"); 
        }
        else{
            System.out.println("Invalid balance.Cannot purchase megaplier.");
            valid = false;
        }
        return valid;

    } 

  

  

  

public static void drawingWinning(int[] userArray, int[] winningNumbers) { 

     userArray = userArray; 

     winningNumbers = winningNumbers; 

        System.out.print("["); 

        for (int i = 0; i < 5; i++) { 

            System.out.print(winningNumbers[i] + " "); 

        } 

        System.out.print("]"); 

        System.out.print("Mega Ball: " + winningNumbers[5]); 

         

    } 

  

  

    // TODO: Update balance after ticket purchase and winnings  


  public static double[] updateBalance(boolean mega,double balance,double prize, double megaplier, double totalWinnings,double totalSpent ){ 
    double[] balanceSpend = new double[3];
  
      if (mega == true){ 

        balance =  balance - 3.00; 

        totalSpent = totalSpent + 3.00;

   } 

    else{ 

        balance =  balance - 2.00; 
        totalSpent = totalSpent + 2.00;

   }

    if (mega == true){
        if (prize < 100000000){
            prize = prize * megaplier;
            balance = balance + prize;
            totalWinnings = totalWinnings + prize;
        }

    }
    else{
        if (prize > 0){
            balance = balance + prize;
            totalWinnings = totalWinnings + prize;
        
           }
    }
   balanceSpend[0] = balance;
   balanceSpend[1] = totalSpent;
   balanceSpend[2] = totalWinnings;
   return balanceSpend;

} 

  

    // TODO: Print game summary (total spent, total winnings, final balance)  

   //public static int[] gameSummary(); 

  

  

    // TODO: Generate an array of 5 unique random numbers (1-70)  

    public static int[] generateNumbers(){  

        int [] randomArray = new int[6];  

        for(int i = 0; i < 6; i++){  

            randomArray[i] = random.nextInt(1,72);  

            boolean valid = false;  

            while (valid == false){  

            for(int x = 0; x < randomArray.length-1; x++){  

            if (randomArray[i] == randomArray[x]){  

                randomArray[i] = random.nextInt(1,72);  

            }  

            else{  

                valid = true;  

            }  

            } 

        }  

} 

     

    Arrays.sort(randomArray);  

  

    randomArray[5] = random.nextInt(1, 27);  

    return randomArray;  

}  

  

public static int[] getValidNumber() { 

    System.out.println("Enter 5 numbers between 1 and 71:"); 

    int[] winning = new int[6]; 

    boolean valid = false; 

    while (!valid) { 

        for (int i = 0; i < 5; i++) { 

            boolean duplicateFound = false; 

            int userinput = scanner.nextInt(); 

            if (userinput >= 1 && userinput <= 71) { 

                for (int j = 0; j < i; j++) { 

                    if (winning[j] == userinput) { 

                        System.out.println("Duplicate number detected! Please enter a different number."); 

                        duplicateFound = true; 

                        break; 

                    } 

                } 

                if (!duplicateFound) { 

                    winning[i] = userinput; 

                } else { 

                    i--;  

                } 

            } else { 

                System.out.println("Invalid input, please enter a number between 1 and 71."); 

                i--;  

            } 

        } 

  

        System.out.println("Enter the Mega Ball number (1-26):"); 

            boolean thevalid = false; 

            while (thevalid == false) { 

                int megaball = scanner.nextInt(); 

                if (megaball >= 1 && megaball <= 26) { 

                    winning[5] = megaball; 

                    thevalid = true; 

                } else { 

                    System.out.println("Invalid Mega Ball number, please enter a number between 1 and 26."); 

                } 

            } 

            valid = true; 

        } 

        return winning; 

    } 

  

  

//public static boolean contains(){ 

  

     

     

//} 

  

  

  

  

  

  

    // TODO: Count matching numbers between user and winning numbers  

public static int countMatches(int[] userArray, int[] winningNumbers ){ 

     boolean jackpot; 

         int matchcount = 0; 

         for(int x = 0; x < userArray.length-1; x++){  

             for(int i = 0; i < winningNumbers.length-1; i++){ 

                 if (userArray[x] == winningNumbers[i]){ 

                     matchcount = matchcount + 1; 

                 } 

             } 

     } 

     return matchcount; 

} 

  

  public static boolean megaball(int[] userArray, int[] winningNumbers){ 

    if (userArray[5] == winningNumbers[5]){ 

        return true;  

    } 

    else{  

        return false;

    } 

  } 

  

    // TODO: Determine the prize amount based on matches  

   public static double prizeAmount(int matches,boolean jackpot){ 

       double prize; 

       if (matches == 5 && jackpot == true){ 

           prize = 100000000; 

       } 
       else if(matches == 5 && jackpot == false){
            prize = 1000000;
             
       }
       else if(matches == 4 && jackpot == true){
            prize = 10000;
       }
       else if(matches == 4 && jackpot == false){
        prize = 5000;
        }
        else if(matches == 3 && jackpot == true){
            prize = 200;
       }
       else if(matches == 3 && jackpot == false){
        prize = 10;
        }
        else if(matches == 2 && jackpot == true){
            prize = 10;
            }
        else if(matches == 1 && jackpot == true){
            prize = 4;
            }
        else if(matches == 0 && jackpot == true){
            prize = 2;
            }
        else{
            prize = 0;
        }
        return prize;

   } 

  

  

    // TODO: Get a random Megaplier value (2x, 3x, 4x, or 5x)  

     

    public static double getRandomMegaplier(boolean want) { 
        double value = 1;
            if (want) { 

                value = random.nextInt(2, 6);  
                return value;

            } 

            return value;  

            } 


        }



