package com.zipcodewilmington.arrayutility;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<Object> {
   //*******Created an array to pass Input array through constructor*******
    private Object[] array;


   //*************Taking Input Array through Constructor****************
    public ArrayUtility(Object[] array) {
        this.array = array;
    }

    //Method to Merge Input Array taken thru Constructor and 1 passed thru method//
    public Object[] mergedArray(Object[] arrayToMerge){

        List<Object> mergedArray = new ArrayList<>();

        for(int i=0; i<this.array.length; i++){
            mergedArray.add(this.array[i]);
        }

        for(int i=0; i< arrayToMerge.length; i++){
            mergedArray.add(arrayToMerge[i]);
        }
            return (Object[]) mergedArray.toArray();
    }


    //CountDuplicatesInMergeTest method
    public Integer countDuplicatesInMerge(Object[] arrayToMerge, Object valueToEvaluate) {
         Object[] arrayToEvaluate = mergedArray(arrayToMerge);

         int count =0;
        for(int i=0; i< arrayToEvaluate.length; i++){
            if(arrayToEvaluate[i] == valueToEvaluate){
                count++;
            }
        }

        return count;
    }

    public Object getMostCommonFromMerge(Object[] arrayToMerge) {
       // int count =0;
        int countprev = 0;
        int countNext =0;
        Object val;
        Object mostCommon = null;

        Object[] arrayToEvaluate = mergedArray(arrayToMerge);

        for(int i=0; i<arrayToEvaluate.length;i++){
            val = arrayToEvaluate[i];
            countNext =0;
            for(int j=0; j<arrayToEvaluate.length; j++){
                if(arrayToEvaluate[j] == val){
                    countNext++;
                }
            }
            if(countprev < countNext){
                mostCommon = val;
                countprev = countNext;
            }

        }

        return mostCommon;
    }




    public Integer getNumberOfOccurrences(Object valueToEvaluate) {
        int num =0;
       for(int i=0; i<this.array.length; i++){
           if(this.array[i] == valueToEvaluate){
               num++;
           }
       }

        return num;
    }



    public Object[] removeValue(Object valueToRemove) {
        List<Object> result = new ArrayList<>();

        for(int i=0; i<this.array.length ; i++){
            if(this.array[i] != valueToRemove){
                Object val = this.array[i];
                result.add(val);
            }
        }

        return (Object[]) result.toArray();
    }
}
