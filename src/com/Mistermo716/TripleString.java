package com.Mistermo716;

public class TripleString {

    private String string1;
    private String string2;
    private String string3;

    public static final int MAX_PULLS = 40;
    private static final int [] pullWinnings = new int [MAX_PULLS];
    public static final int MAX_LEN = 20;
    public static int numPulls;



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
        else{
            return false;
        }
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        if(validString(string1)) {
            this.string1 = string1;
        }
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        if(validString(string2)) {
            this.string2 = string2;
        }
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        if(validString(string3)) {
            this.string3 = string3;
        }
    }
}
