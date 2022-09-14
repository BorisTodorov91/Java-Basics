package Exam;

import java.util.Scanner;

public class P02AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceForBaggage = Double.parseDouble(scanner.nextLine());
        double kilogramForBaggage = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int numOfBaggage = Integer.parseInt(scanner.nextLine());

        double totalSumAfterCheckForWeight = 0;
        double totalSumAfterCheckDaysUntilTheTrip = 0;
        double sum = 0;


        // Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
        if (kilogramForBaggage < 10 ){
            //•	до 10кг – 20% от цената на багаж над 20кг
            totalSumAfterCheckForWeight = priceForBaggage * 0.2;
        }else if (kilogramForBaggage >= 10 && kilogramForBaggage <= 20){
            //•	между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
            totalSumAfterCheckForWeight = priceForBaggage * 0.5;
        }
        else if ( kilogramForBaggage > 20){
            totalSumAfterCheckForWeight = priceForBaggage;
        }
       //В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
        if(days > 30){
            //•	повече от 30 дни - цената на багажа се оскъпява с 10%
            totalSumAfterCheckDaysUntilTheTrip = totalSumAfterCheckForWeight + totalSumAfterCheckForWeight * 0.1;

        }else if (days >= 7){
            //•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
            totalSumAfterCheckDaysUntilTheTrip = totalSumAfterCheckForWeight + totalSumAfterCheckForWeight* 0.15;
        }else {
            //•	по-малко от 7 дни - цената на багажа се оскъпява с 40%
            totalSumAfterCheckDaysUntilTheTrip = totalSumAfterCheckForWeight + totalSumAfterCheckForWeight * 0.4;
        }


        sum = totalSumAfterCheckDaysUntilTheTrip * numOfBaggage;

        System.out.printf("The total price of bags is: %.2f lv. ", sum);

    }
}
