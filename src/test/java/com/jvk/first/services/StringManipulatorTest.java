package com.jvk.first.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
class StringManipulatorTest {

    @InjectMocks
    private StringManipulator stringManipulator;

    @Test
    void should_reverse_the_given_text() {
        //Act
        String actualString = stringManipulator.reverseString("elsa jibin");

        //Assert
        String expectedString = "nibij asle";
        assertThat(actualString).isEqualTo(expectedString);
    }
}