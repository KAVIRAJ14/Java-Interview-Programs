import java.util.Scanner;

public class armstrong {
    public static void main(String args[]) {
        System.out.println("Enter the 3 digit number");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt(); // 153
        int temp, total = 0, result = number;

        while (result != 0) {
            temp = result % 10;
            total +=Math.pow(temp, 3); // Cubing each digit
            result /= 10;
        }

        if (number == total) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}