package Exam;

import java.util.Scanner;

public class P06TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOfTurnir = Integer.parseInt(scanner.nextLine());

        int totalCountWin = 0;
        int totalCountLoss = 0;

        double moneyDay = 0;
        double totalMoney = 0;

        for (int i = 1; i <= daysOfTurnir; i++) {
            int countWin=0;
            int countLoss=0;
            String sport = scanner.nextLine();
            while (!sport.equals("Finish")) {
                String result = scanner.nextLine();

                if (result.equals("win")) {
                    moneyDay += 20;
                    countWin++;
                } else if (result.equals("lose")) {
                    countLoss++;
                }
                sport = scanner.nextLine();
            }

            if (countWin > countLoss) {
                double procent = moneyDay * 0.1;
                moneyDay += procent;
            }
            totalCountWin += countWin;
            countWin=0;
            totalCountLoss += countLoss;
            countLoss = 0;
            totalMoney += moneyDay;
            moneyDay = 0;
        }


        if(totalCountWin > totalCountLoss){
            double procent = totalMoney * 0.2;
            totalMoney += procent;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        }
        else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
