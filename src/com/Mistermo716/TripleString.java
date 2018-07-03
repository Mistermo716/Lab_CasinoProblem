package com.Mistermo716;

public class TripleString {

    private String string1;
    private String string2;
    private String string3;

    public static final int MAX_PULLS = 40;
    public static boolean gameRound = true;
    private static final int [] pullWinnings = new int [MAX_PULLS];
    public static final int MAX_LEN = 20;
    public static int numPulls = 0;



    //Default Constructor
    public void TripleString(){
        this.string1 = "";
        this.string2 = "";
        this.string3 = "";
    }

    public boolean validString(String str){
        if(!str.equals(null) && str.length() <= this.MAX_LEN){
            return true;
        }
            return false;
    }

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

    public void setGameRound(boolean gameRound){
        this.gameRound = gameRound;
    }

    public String toString(){
        String combinedStr = this.string1 + " " + this.string2 +  " " + this.string3;
        return combinedStr;
    }

    public boolean saveWinnings(int winnings){
        pullWinnings[numPulls] = winnings;
        numPulls += 1;
        return true;
    }

    public String displayWinnings(){
        int totalWinnings = 0;
        for(int i = 0; i < numPulls; i++){
            totalWinnings += pullWinnings[i];
        }
        return "Your total Winnings: " + totalWinnings;
    }

}
