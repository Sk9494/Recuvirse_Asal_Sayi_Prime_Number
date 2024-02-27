import  java.util.Scanner;
public class Main {
    static boolean isPrime(int number, int i) {
        if (number <= 1) {
            return false;
        }
        if (i * i > number) {
            return true;

        }
        if (number % i == 0) {
            return false;
        }
        return isPrime(number, i + 1);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = input.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " is a prime number .");
        } else {
            System.out.println(number + " is not a prime number .");
        }
    }
}