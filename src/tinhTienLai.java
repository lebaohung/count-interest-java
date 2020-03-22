import java.util.Scanner;
public class tinhTienLai {
    public static void main(String[] args) {
        System.out.println("COUNT INTEREST.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input money: ");
        int money = scanner.nextInt();
        System.out.print("Input interest rate (% per year): ");
        double interest = scanner.nextDouble();
        System.out.print("Input month: ");
        int month = scanner.nextInt();
        double totalInterest = 0;
        for (int i = 1 ; i < month; i++) {
            totalInterest += money * interest /100 / 12 * month;
        }
        System.out.println("Total interest is " + totalInterest);
    }
}
