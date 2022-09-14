package Exam;

import java.util.Scanner;

public class P01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String avioCompany = scanner.nextLine();
        int numOfAdoltTikcet = Integer.parseInt(scanner.nextLine());
        int numOfChildTicket = Integer.parseInt(scanner.nextLine());
        double priceForAdolt = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());

        double priceForChild = priceForAdolt - (priceForAdolt * 0.7);


        double sum = ((priceForAdolt + tax) * numOfAdoltTikcet )+ ((priceForChild + tax)* numOfChildTicket);
        double result = sum * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", avioCompany, result);

    }
}
