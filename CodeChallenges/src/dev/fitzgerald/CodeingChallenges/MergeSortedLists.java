package dev.fitzgerald.CodeingChallenges;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeSortedLists {

    public static void main(String[] args){


    }

    public static LinkedList<Integer> MergeSorted(List<LinkedList<Integer>> values){
        LinkedList<Integer> result = new LinkedList<>();
        int lowest = Integer.MAX_VALUE;
        int sentinel = 0;
        if(values.size() == 0){
            return result;
        } else if(values.size() == 1){
            return values.get(0);
        } else {
            for(int i = 0; i < values.size(); i++){
                for(int j = 0; j < values.get(i).size(); j++){
                    result.add(values.get(i).get(j));
                }
            }
            Collections.sort(result);
        }

        return result;
    }
}

