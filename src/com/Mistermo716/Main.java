package com.Mistermo716;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        TripleString bet1 = new TripleString();
//        bet1.setString1("Cherries");
//        bet1.setString2("Bar");
//        bet1.setString3("[Space]");
//
//        String str = bet1.toString();
//
//        System.out.println(str);
       int multipler =  getPayMutiplier(pull().toString());
        System.out.println(multipler);


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
    public static TripleString pull(){
        TripleString newPull = new TripleString();

        newPull.setString1(randString());
        newPull.setString2(randString());
        newPull.setString3(randString());
        String str = newPull.toString();
        System.out.println(str);

        return newPull;
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
