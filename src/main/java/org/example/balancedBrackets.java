package org.example;

public class balancedBrackets {

    public static boolean checkBrackets(String s){
        int leftBrackets = 0;
        int rightBrackets = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                leftBrackets += 1;
            } else if (s.charAt(i) == ')'){
                rightBrackets += 1;
            }
        }
        if(rightBrackets == leftBrackets){
            return true;
        }
        else return false;
    }
}
