import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int fourDigit = scanner.nextInt();
        String numStr = Integer.toString(fourDigit);
        if (numStr.charAt(0) == numStr.charAt(3) && numStr.charAt(1) == numStr.charAt(2)) {
            System.out.println(1); // The number is symmetric
        } else {
            System.out.println(37); // The number is not symmetric
        }
    }
}