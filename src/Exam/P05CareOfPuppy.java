package Exam;

import java.util.Scanner;

public class P05CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int neededFood = Integer.parseInt(scanner.nextLine());
        String comand = scanner.nextLine();

        int sum = 0;
        while (!comand.equals("Adopted")){
            double food = Double.parseDouble(comand);
            sum += food;
            comand = scanner.nextLine();
        }
        int totalFood = neededFood * 1000;

        if (totalFood >= sum){
            System.out.printf("Food is enough! Leftovers: %d grams.", totalFood - sum);
        }else {
            System.out.printf("Food is not enough. You need %d grams more.", sum - totalFood);
        }
    }
}
