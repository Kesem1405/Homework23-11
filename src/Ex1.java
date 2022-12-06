import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        numbersBiggerThenAverage();
    }

    public static void numbersBiggerThenAverage() {
        int[] userInput = new int[10];
        System.out.println("Hello! Enter 10 numbers.");
        Scanner scanner = new Scanner(System.in);
        userInput[0] = scanner.nextInt();
        userInput[1] = scanner.nextInt();
        userInput[2] = scanner.nextInt();
        userInput[3] = scanner.nextInt();
        userInput[4] = scanner.nextInt();
        userInput[5] = scanner.nextInt();
        userInput[6] = scanner.nextInt();
        userInput[7] = scanner.nextInt();
        userInput[8] = scanner.nextInt();
        userInput[9] = scanner.nextInt();
        int averageCalculator;
        averageCalculator = (userInput[0] + userInput[1] + userInput[2] + userInput[3] + userInput[4] + userInput[5] + userInput[6] + userInput[7] + userInput[8] + userInput[9]) / 10;
        for (int i = 0; i < userInput.length; i++) {
            if (userInput[i] > averageCalculator) {
                System.out.println(userInput[i]);
            }
        }
    }
}