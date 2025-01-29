
import java.util.Scanner; //import scanner
class warmup {  //what the file is called
    static void down() {  //create a new function called down
        Scanner scanner = new Scanner(System.in);
        boolean valid = false;
        int number = 0;
        while (!valid){
            try {  //error handling
            System.out.print("Enter number: "); 
            number = scanner.nextInt();
            valid = true;
        
            }
    
             catch (Exception e ) {
                System.out.println("Valid Integer is not entered");
                scanner.nextLine();
            }


    }
    for (int i = number;i >= 0; i--){    //start loop with i = number and run till i = 0
        System.out.println(i); //print i on new line
}
scanner.close();
}

    public static void main(String[] args) {
        down();
        
    }
}
