package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double number1 = scanner.nextDouble();
        double result = number + number1;
        System.out.println(result);
        scanner.close();
    }
}