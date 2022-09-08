package Exam;

import java.util.Scanner;

public class P04FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double totalEatenFood = Double.parseDouble(scanner.nextLine());

        double foodEatenFromDog= 0;
        double foodEatenFromCat= 0;
        double gift = 0;

        for (int i = 1; i <= days ; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());
            foodEatenFromDog += dogFood;
            foodEatenFromCat += catFood;


            if(i % 3 == 0){
                gift += (dogFood + catFood) * 0.1;

            }
        }
        double totalEatenFoodFromDogAndCat = foodEatenFromDog + foodEatenFromCat;

        System.out.printf("Total eaten biscuits: %dgr.%n", (int)gift);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFoodFromDogAndCat / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", foodEatenFromDog / totalEatenFoodFromDogAndCat * 100);
        System.out.printf("%.2f%% eaten from the cat.", foodEatenFromCat / totalEatenFoodFromDogAndCat * 100);



    }
}
