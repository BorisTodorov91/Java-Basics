package Exam;

import java.util.Scanner;

public class P03FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double sum = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();


        double totalSum = 0;

        if(sex.equals("m")){
            switch (sport){
                case "Gym":
                    totalSum = 42;
                    break;
                case "Boxing":
                    totalSum = 41;
                    break;
                case "Yoga":
                    totalSum = 45;
                    break;
                case "Zumba":
                    totalSum = 34;
                    break;
                case "Dances":
                    totalSum = 51;
                    break;
                case "Pilates":
                    totalSum = 39;
                    break;
            }
        }else  if (sex.equals("f")){
            switch (sport){
                case "Gym":
                    totalSum = 35;
                    break;
                case "Boxing":
                case "Pilates":
                    totalSum = 37;
                    break;
                case "Yoga":
                    totalSum = 42;
                    break;
                case "Zumba":
                    totalSum = 31;
                    break;
                case "Dances":
                    totalSum = 53;
                    break;
            }
        }

        double procent = 0;
        if(age  <= 19){
          procent = totalSum * 0.20;
          totalSum = totalSum - procent;
        }

        if ( sum >= totalSum){
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }else if (sum <= totalSum){
            System.out.printf("You don't have enough money! You need $%.2f more.", totalSum - sum );
        }
    }
}
