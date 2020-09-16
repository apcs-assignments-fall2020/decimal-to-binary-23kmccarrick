import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int result = 0;
        int no = Integer.parseInt(binary);
        for (int i = 0; i < binary.length(); i++){
            if (no%10==1)
                result += Math.pow(2,i);
            no = no/10;
        }
        return result;
        // REPLACE WITH YOUR CODE HERE
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type in a number in binary format:");
        String input = scan.nextLine();
        System.out.println("That is equal to the decimal value: " + binaryToDecimal(input));
    }
}
