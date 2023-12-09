import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();
        int five = scanner.nextInt();
        int six = scanner.nextInt();

        int hourOne = one * 60;
        int minOne = (hourOne + two) * 60;
        int secondOne = minOne + three;
        int hourTwo = four * 60;
        int minTwo = (hourTwo + five) * 60;
        int secondTwo = minTwo + six;
        int result = secondTwo - secondOne;

        System.out.println(result);

    }
}