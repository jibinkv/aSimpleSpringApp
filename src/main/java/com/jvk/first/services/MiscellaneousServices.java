package com.jvk.first.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class MiscellaneousServices {
    private StringManipulator stringManipulator;

    @Autowired
    public MiscellaneousServices(StringManipulator stringManipulator) {
        this.stringManipulator = stringManipulator;
    }

    public int[] reverseGivenArray(int[] givenArray) {
        int[] reverseArray = getSortedMethod1(givenArray);
//        int[] reverseArray = getSortedMethod2(givenArray);
        return reverseArray;
    }

    private int[] getSortedMethod1(int[] givenArray) {
        int[] reverseArray = new int[givenArray.length];
        for (int leftInt : givenArray) {
            int count = 0;
            for (int rightInt : givenArray) {
                if (leftInt < rightInt) {
                    count++;
                }
            }
            reverseArray[count] = leftInt;
        }
        return reverseArray;
    }

    private int[] getSortedMethod2(int[] givenArray) {
        for (int i=0; i < givenArray.length -1; i++) {
            for (int j=0; j < givenArray.length -1; j++) {
                int temp = 0;
                if (givenArray[j] < givenArray[j+1]) {
                    temp = givenArray [j+1];
                    givenArray[j+1] = givenArray[j];
                    givenArray[j] = temp;
                }
            }
        }
        return givenArray;
    }

    public String reverseGivenString(String givenString) {
        return stringManipulator.reverseString(givenString);
    }

    public int retrieveFirstDuplicate(int[] givenArray) {
        Set<Integer> aSet = new HashSet<>();
        int firstDuplicate = -1;
        for(int item: givenArray){
            if(!aSet.add(item)) {
                firstDuplicate = item;
                break;
            }
        }
        return firstDuplicate;
    }
}

