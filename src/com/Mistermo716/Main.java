package com.Mistermo716;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TripleString game = new TripleString();
        System.out.println("Hello Welcome to the casino");

        Scanner input = new Scanner(System.in);

        while(game.numPulls < 40 && game.gameRound == true) {
            System.out.println("1.  Make a bet and pull");
            System.out.println("99. Quit");
            int userInput = input.nextInt();

            if(userInput == 1) {
                System.out.println("What is your bet?");
                int currentInput = 0;
                currentInput = input.nextInt();
                int bet = getBet(currentInput);

                int multipler = getPayMutiplier(pull(game).toString());
                game.saveWinnings(bet * multipler);
                System.out.println("Congrats you win: " + bet*multipler);
            }
            if(userInput == 99){
                game.setGameRound(false);
                game.displayWinnings();
            }

        }

        System.out.println(game.displayWinnings());


    }

    //validates the bet before giving it to the Triple String class.
    public static int getBet(int bet){
        Scanner input = new Scanner(System.in);
        if(bet >= 0 && bet <=100){
            return bet;
        }
        while(bet < 0 || bet > 100){
            System.out.println("Please enter a valid bet between 0 & 100");
            bet = input.nextInt();
        }
        return bet;
    }
    public static TripleString pull(TripleString objPull){

        objPull.setString1(randString());
        objPull.setString2(randString());
        objPull.setString3(randString());
        String str = objPull.toString();
        System.out.println(str);

        return objPull;
    }

    public static int getPayMutiplier(String pulledString){

        String arr[] = pulledString.split(" ", 0);

        if(arr[0].equals("cherries") && !arr[1].equals("cherries")){
            return 5;
        }
        if(arr[0].equals("cherries") && arr[1].equals("cherries") && !arr[2].equals("cherries")){
            return 15;
        }
        if(arr[0].equals("cherries") && arr[1].equals("cherries") && arr[2].equals("cherries")){
            return 30;
        }
        if(arr[0].equals("BAR") && arr[1].equals("BAR") && arr[2].equals("BAR")){
            return 50;
        }
        if(arr[0].equals("7") && arr[1].equals("7") && arr[2].equals("7")){
            return 100;
        }

        return 1;

    }

    private static String randString(){
        int randomNum = (int)(Math.random()* 1000) + 1;

        if(randomNum <= 500){
            return "BAR";
        }
        if(randomNum > 500 && randomNum <= 625){
            return "cherries";
        }
        if(randomNum > 625 && randomNum <= 750){
            return "space";
        }

        return "7";
    }
}
