import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        int sumOfDigits = 0;
        int tempNumber = Math.abs(number);

        while (tempNumber > 0) {
            sumOfDigits += tempNumber % 10;
            tempNumber /= 10;
        }

        if (number > 0 && number % sumOfDigits == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
        
        scanner.close();
    }
}
