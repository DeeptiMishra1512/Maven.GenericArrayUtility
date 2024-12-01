package com.zipcodewilmington.arrayutility;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 3/1/18.
 * The purpose of this class is to thoroughly test the method getMostCommonFromMerge()
 */
public class GetMostCommonFromMergeTest {
    @Test
    public void integerTest() {
        // Given
        Object expected = 7;
        Object[] inputArray = {1, 2, expected, 8, 4, 5, expected, 0, 9, 8, expected};
        Object[] arrayToMerge = {1, 2, expected, 8, 4, 5, expected, 0, 9, 8};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Object actual = arrayUtility.getMostCommonFromMerge(arrayToMerge);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void longTest() {
        // Given
        Long expected = 8L;
        Object[] inputArray = {1L, 2L, expected, 8L, 4L, 5L, expected, 0L, 9L, 8L, expected};
        Object[] arrayToMerge = {1L, 2L, expected, 8L, 4L, 5L, expected, 0L, 9L, 8L, expected};
        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Long actual = (Long) arrayUtility.getMostCommonFromMerge(arrayToMerge);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringTest() {
        // Given
        String expected = "a";
        Object[] inputArray = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected};
        Object[] arrayToMerge = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected, expected};

        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        String actual = (String) arrayUtility.getMostCommonFromMerge(arrayToMerge);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void objectTest() {
        // Given
        Object expected = "a";
        Object[] inputArray = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected};
        Object[] arrayToMerge = {"1", "2", expected, "8", "4", "5", expected, "0", "9", "8", expected, expected, expected};

        ArrayUtility<Object> arrayUtility = new ArrayUtility<Object>(inputArray);

        // When
        Object actual = arrayUtility.getMostCommonFromMerge(arrayToMerge);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
