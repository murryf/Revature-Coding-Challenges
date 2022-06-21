package dev.fitzgerald.CodeingChallenges;

public class Sherlock {

    public static void main(String[] args){
        System.out.println(squares(1,1000000000));
    }

    public static int squares(int left, int right){
        int result = 0;

        //hacky solution
        for(int i = (int)Math.sqrt((double)left); i <= (int)Math.sqrt((double)right); i++){
            if(Math.pow(i,2) >= left && Math.pow(i,2) <= right){
                result++;
            }
        }

        return result;
    }
}
