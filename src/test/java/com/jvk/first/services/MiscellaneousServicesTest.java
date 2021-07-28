package com.jvk.first.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MiscellaneousServicesTest {
    @InjectMocks
    private MiscellaneousServices miscellaneousServicesMock;

    @Mock
    private StringManipulator stringManipulatorMock;

    @Test
    void should_reverse_a_given_array() {
        //Arrange
        int[] givenArray = new int[]{1, 4, 3, 2, 5};
        int[] expectedArray = new int[]{5, 4, 3, 2, 1};

        //Act
        int[] actualArray = miscellaneousServicesMock.reverseGivenArray(givenArray);

        //Assert
        assertThat(actualArray).isEqualTo(expectedArray);
    }

    @Test
    void should_call_string_manipulator() {
        //Arrange
        String expectedString = "nibij";
        when(stringManipulatorMock.reverseString(anyString())).thenReturn(expectedString);

        //Act
        String givenString = "jibin";
        String actualString = miscellaneousServicesMock.reverseGivenString(givenString);

        //Assert
        verify(stringManipulatorMock).reverseString(givenString);
        assertThat(actualString).isEqualTo(expectedString);
    }

    @Test
    void should_get_first_duplicate_from_list() {
        //Arrange
        int[] givenArray = new int[]{2,3,6,5,10,14,15,5};

        //Act
        int firstDuplicate = miscellaneousServicesMock.retrieveFirstDuplicate(givenArray);

        //Assert
        assertThat(firstDuplicate).isEqualTo(5);
    }
}