package com.date;

import java.util.HashSet;

public class firstDuplicate {
    public static int firstDuplicateBigOOfN(int[]numbers){
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            if (!seen.contains(numbers[i])) {
                seen.add(numbers[i]);
            } else {
                System.out.println("The First duplicate for which the second occurance has minimum index = " + numbers[i]);
                return i;
            }
        }
        return -1;
    }

    public static int firstDuplicateBigOOfNBestSpaceComplexity(int[] numbers){
        for(int i=0; i<numbers.length; i++){
            if(numbers[Math.abs(numbers[i]) -1] < 0){
                System.out.println("The First duplicate for which the second occurance has minimum index = " + Math.abs(numbers[i]));
                return Math.abs(numbers[i] - 1);
            }
            else{
                numbers[numbers[i] -1] = numbers[numbers[i] -1]*-1;
            }
        }
        return -1;
    }
}
