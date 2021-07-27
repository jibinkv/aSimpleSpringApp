package com.jvk.first.services;

import org.springframework.stereotype.Service;

@Service
public class StringManipulator {

    public String reverseString(String word) {
        return new StringBuilder().append(word).reverse().toString();
    }
}
