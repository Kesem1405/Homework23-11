import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello!Enter your phone number:");
        String phoneNumber;
        phoneNumber = scanner.nextLine();
        phoneNumberFixer(phoneNumber);
    }

    public static String phoneNumberFixer(String phoneNumber) {
        int hyphen = phoneNumber.charAt(3);
        if (phoneNumber.length() >= 10 && phoneNumber.length() <= 12) {
            if (phoneNumber.length() == 10) {
                System.out.println(phoneNumber.substring(0, 3) + "-" + phoneNumber.substring(3));
            } else if (hyphen == '-' && phoneNumber.length() == 11) {
                System.out.println(phoneNumber);
            } else if (phoneNumber.length() == 12 && phoneNumber.contains("972")) {
                System.out.println("0" + phoneNumber.substring(3, 5) + "-" + phoneNumber.substring(5, 12));
            }
        } else {
            phoneNumber = "";
            System.out.println(phoneNumber);
        }
        return phoneNumber;
    }
}