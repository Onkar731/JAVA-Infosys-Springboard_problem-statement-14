import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        double number = sc.nextDouble();

        // getting ceil value of number using ceil() method of Ceil class
        long ceilValue = Ceil.ceil(number);

        // printing ceil value of the number
        System.out.println(ceilValue);

        // closing resource
        sc.close();
    }    
}
