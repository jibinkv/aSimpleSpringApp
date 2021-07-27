package com.jvk.first.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MiscellaneousServices {
    private StringManipulator stringManipulator;

    @Autowired
    public MiscellaneousServices(StringManipulator stringManipulator) {
        this.stringManipulator = stringManipulator;
    }

    public int[] reverseGivenArray(int[] givenArray) {
        int[] reverseArray = new int[givenArray.length];
        for (int i = 0; i < givenArray.length; i++) {
            int greater = 0;
            for (int j = 0; j < givenArray.length; j++) {
                if (givenArray[i] < givenArray[j]) {
                    greater++;
                }
            }
            reverseArray[greater] = givenArray[i];
        }
        return reverseArray;
    }

    public String reverseGivenString(String givenString) {
        return stringManipulator.reverseString(givenString);
    }
}

