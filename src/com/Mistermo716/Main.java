package com.Mistermo716;

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
}
