package com.Mistermo716;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TripleString bet1 = new TripleString();
        bet1.setString1("Cherries");
        bet1.setString2("Bar");
        bet1.setString3("[Space]");

        String str = bet1.toString();

        System.out.println(str);
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

    private String randString(){
        Math.random();
    }
}
