package dev.fitzgerald.CodeingChallenges;

import java.util.ArrayList;
import java.util.Comparator;

public class MeanValue {

    public static void main(String[] args){
        int[] a = new int[]{1,2,3,4};
        int[] b = new int[]{20};
        System.out.println(median(a,b));
    }

    public static double median(int[] nums1, int[] nums2){
//        double result = 0;
//        double checked = 0;
//        if(N%2 == 0){
//            result += nums1[N/2]+nums1[(N-1)/2];
//            checked += 2;
//        }else{
//            result += nums1[N/2];
//            checked += 1;
//        }
//        if(M%2 == 0){
//            result += nums2[M/2]+nums2[(M-1)/2];
//            checked += 2;
//        } else{
//            result += nums2[M/2];
//            checked += 1;
//        }
        ArrayList<Integer> combo = new ArrayList<>();
        for(int num : nums1){
            combo.add(num);
        }
        for(int num: nums2){
            combo.add(num);
        }
        combo.sort(Comparator.naturalOrder());
        if(combo.size()%2 == 0){
            return combo.get(((combo.size()/2)+(combo.size()-1)/2)/2);
        } else{
            return combo.get(combo.size()/2);
        }
    }
}
