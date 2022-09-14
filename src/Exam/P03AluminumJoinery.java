package Exam;

import java.util.Scanner;

public class P03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numOfJoinery = Integer.parseInt(scanner.nextLine());
        String typeOfJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();

        double amount = 0;
        if (!(numOfJoinery < 10)) {

            switch (typeOfJoinery) {
                case "90X130":
                    amount = numOfJoinery * 110;
                    if (numOfJoinery > 30 && numOfJoinery < 60) {
                        amount = amount - (amount * 0.05);
                    } else if ( numOfJoinery > 60 ){
                        amount = amount - (amount * 0.08);
                    }
                    break;
                case "100X150":
                    amount = numOfJoinery * 140;
                    if ( numOfJoinery > 40 && numOfJoinery < 80){
                        amount = amount - (amount * 0.06);
                    }else if ( numOfJoinery > 80){
                        amount = amount - (amount * 0.1);
                    }
                    break;
                case "130X180":
                    amount = numOfJoinery * 190;
                    if ( numOfJoinery > 20 && numOfJoinery < 50){
                        amount = amount - (amount * 0.07);
                    }else if ( numOfJoinery > 50){
                        amount = amount - (amount * 0.12);
                    }
                    break;
                case "200X300":
                    amount = numOfJoinery * 250;
                    if ( numOfJoinery > 25 && numOfJoinery < 50){
                        amount = amount - (amount * 0.09);
                    }else if ( numOfJoinery > 50){
                        amount = amount - (amount * 0.14);
                    }
                    break;
            }

            if (delivery.equals("With delivery")){
                amount += 60;
            }

            if ( numOfJoinery > 99){
                amount = amount - (amount * 0.04);
            }
        }else {
            System.out.println("Invalid order");
            return;
        }
        System.out.printf("%.2f BGN", amount);
    }
}
