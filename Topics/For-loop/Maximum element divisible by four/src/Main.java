import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();

        // Initialize max as the smallest possible value
        int maxDivByFour = 0;

        // Loop to read each element
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            // Check if num is divisible by 4 and greater than current max
            if (num % 4 == 0 && num > maxDivByFour) {
                maxDivByFour = num;
            }
        }

        // Print the maximum number divisible by 4
        System.out.println(maxDivByFour);


    }
}