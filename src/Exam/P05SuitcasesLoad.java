package Exam;

import java.util.Scanner;

public class P05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capasity = Double.parseDouble(scanner.nextLine());
        String comand = scanner.nextLine();

        double totalSum = capasity;
        int count = 0;


        while (!comand.equals("End")) {
            double suitcases = Double.parseDouble(comand);

            if (totalSum <= suitcases){
                System.out.printf("No more space!%n");
                break;
            }
            count++;
            if((count +1 ) % 3 == 0){
                suitcases = suitcases * 1.1;
            }

            totalSum -= suitcases;
            comand = scanner.nextLine();
            suitcases = 0;

        }

        if (comand.equals("End")){
            System.out.printf("Congratulations! All suitcases are loaded!%n");
        }

        System.out.printf("Statistic: %d suitcases loaded.", count);



    }
}
