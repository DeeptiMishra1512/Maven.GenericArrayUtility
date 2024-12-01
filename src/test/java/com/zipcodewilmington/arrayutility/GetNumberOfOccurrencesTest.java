package com.zipcodewilmington.arrayutility;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to thoroughly test the method getNumberOfOccurrences()
 */
public class GetNumberOfOccurrencesTest {
    @Test
    public void integerTest() {
        // Given
        Object valueToEvaluate = 7;
        Object expected = 3;
        Object[] inputArray = {1, 2, valueToEvaluate, 8, 4, 5, valueToEvaluate, 0, 9, 8, valueToEvaluate};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longTest() {
        // Given
        Object valueToEvaluate = 7L;
        Integer expected = 4;
        Object[] inputArray = {1L, 2L, valueToEvaluate, 8L, 4L, 5L, valueToEvaluate, 0L, 9L, 8L, valueToEvaluate, valueToEvaluate};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringTest() {
        // Given
        Object valueToEvaluate = "a";
        Integer expected = 2;
        Object[] inputArray = {"1", "2", valueToEvaluate, "8", "4", "5", valueToEvaluate, "0", "9", "8"};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void objectTest() {
        // Given
        Object valueToEvaluate = new Object();
        Integer expected = 1;
        Object[] inputArray = {"1", "2", "8", "4", "5", "0", "9", "8", valueToEvaluate};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Integer actual = arrayUtility.getNumberOfOccurrences(valueToEvaluate);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
