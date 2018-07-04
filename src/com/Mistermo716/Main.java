package com.Mistermo716;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      //creates TripleString object for the game
      TripleString game = new TripleString();
      System.out.println("Hello Welcome to the casino");

      //for user input
      Scanner input = new Scanner(System.in);

      //while loop that will end if user quits or 40 pulls have been made.
      while(game.numPulls < 40 && game.gameRound == true) {
            System.out.println(" ");
            System.out.println("Make a bet between (1-100) or 0 to quit?");
            int currentInput = 0;
            //grab next int from user input.
            currentInput = input.nextInt();

            //if input is not 0 we will bet and pull
            if(currentInput != 0) {
               int bet = getBet(currentInput);

               System.out.println("whirrrrrr .... and your pull is ... ");
               //multiplier method is called with result of the pull method
               //it will then convert pull method object return to string
               int multiplier = getPayMultiplier(pull(game).toString());
               game.saveWinnings(bet * multiplier);
               //if the multiplier is greater than 0 they have won.
               if (multiplier > 0) {
                  System.out.println("Congrats you win: $" + bet * multiplier);
               }
               //if multiplier is equal to zero than lose that round.
               if (multiplier == 0) {
                  System.out.println("Sorry you lost this time");
               }
            }
            //0 is for quits.
            if(currentInput == 0){
                game.setGameRound(false);
                game.displayWinnings();
            }

        }

        //display winnings at the end of the game.
        System.out.println(game.displayWinnings());


    }

    //validates the bet before giving it to the Triple String class.
    public static int getBet(int bet){
        Scanner input = new Scanner(System.in);
        if(bet >= 0 && bet <=100){
            return bet;
        }
        //while the bet is not acceptable loop until it is.
        while(bet < 0 || bet > 100){
            System.out.println("Please enter a valid bet between 0 & 100");
            bet = input.nextInt();
        }
        return bet;
    }

    //returns TripleString Object with the pull
    public static TripleString pull(TripleString objPull){

       //sets the strings of the object
       //randString() method generates random string
        objPull.setString1(randString());
        objPull.setString2(randString());
        objPull.setString3(randString());
        String str = objPull.toString();
        System.out.println(str);

        return objPull;
    }

    //Will get the multiplier of winnings by the sequence of the strings.
    public static int getPayMultiplier(String pulledString){

       //will split the string into array indexes by the space in the string
        String arr[] = pulledString.split(" ", 0);

        //will compare sequences for the multiplier
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

        //if none the money is lost. multiplier of 0
        return 0;

    }

    //will generate random string and return String
    private static String randString(){
       //math random to generate random number
        int randomNum = (int)(Math.random()* 1000) + 1;

        //each string associated with set of numbers based on probability.
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
