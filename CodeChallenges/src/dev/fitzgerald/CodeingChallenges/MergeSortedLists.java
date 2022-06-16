package dev.fitzgerald.CodeingChallenges;

import java.util.LinkedList;
import java.util.List;

public class MergeSortedLists {

    public static void main(String[] args){


    }

    public static LinkedList MergeSorted(List[] values){

        if(values.length == 0){
            return new LinkedList();
        } else if(values.length == 1){
            LinkedList<Integer> result = (LinkedList<Integer>) values[0];
            return result;
        }

        return null;
    }
}
