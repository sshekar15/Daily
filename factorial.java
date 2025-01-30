import java.util.Scanner; 
class factorial {
    static void factorial() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = scanner.nextInt();
        int sum = 1;
        int i;
        for(i = num; i > 0; i--){
            sum = i * sum;
            
        }
        System.out.println("Factorial of " + num + " is " + sum);
    
       
        scanner.close();
    }
    public static void main(String[] args) {
        factorial();

}
}
