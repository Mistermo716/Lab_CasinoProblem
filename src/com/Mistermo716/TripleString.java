package com.Mistermo716;

public class TripleString {

    //declaring string variables
    private String string1;
    private String string2;
    private String string3;

    //amount of pulls a user is allowed
    public static final int MAX_PULLS = 40;
    //this will decide if game is ended or not.
    public static boolean gameRound = true;
    //this will hold an array of winnings which will be added together later.
    private static final int [] pullWinnings = new int [MAX_PULLS];
    //this will check length of string
    public static final int MAX_LEN = 20;
    //this is a counter for the number of pulls a user has had.
    public static int numPulls = 0;



    //Default Constructor
    public void TripleString(){
        this.string1 = "";
        this.string2 = "";
        this.string3 = "";
    }


    //class method will check to see if string is valid
    public boolean validString(String str){
        if(!str.equals(null) && str.length() <= this.MAX_LEN){
            return true;
        }
            return false;
    }

    //Below is a set of getters and setters for the string variables
    public String getString1() {
        return string1;
    }

    public boolean setString1(String string1) {
        if(validString(string1)) {
            this.string1 = string1;
            return true;
        }
        return false;
    }

    public String getString2() {
        return string2;
    }

    public boolean setString2(String string2) {
        if(validString(string2)) {
            this.string2 = string2;
            return true;
        }
        return false;
    }

    public String getString3() {
        return string3;
    }

    public boolean setString3(String string3) {
        if(validString(string3)) {
            this.string3 = string3;
            return true;
        }
        return false;
    }


    //will set whether the game has ended or not.
    public void setGameRound(boolean gameRound){
        this.gameRound = gameRound;
    }

    //will concatenate all strings into one string.
    public String toString(){
        String combinedStr = this.string1 + " " + this.string2 +  " " + this.string3;
        return combinedStr;
    }

    //will save the winnings to an array to keep track of later
    public boolean saveWinnings(int winnings){
        pullWinnings[numPulls] = winnings;
        numPulls += 1;
        return true;
    }

    //will display total winnings to the user.
    public String displayWinnings(){
        int totalWinnings = 0;
        for(int i = 0; i < numPulls; i++){
            totalWinnings += pullWinnings[i];
        }
        return "Your total Winnings: $" + totalWinnings;
    }

}
