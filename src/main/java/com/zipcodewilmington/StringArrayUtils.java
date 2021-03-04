package com.zipcodewilmington;

import java.util.ArrayList;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String arrayMember : array){
            if(arrayMember.equals(value)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> stringArrList = new ArrayList<String>();

        for(int i= array.length-1;i>=0;i--){
            stringArrList.add(array[i]);
        }

        String[] returnString = stringArrList.toArray(new String[stringArrList.size()]);
        return returnString;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean isPalin = false;
        String[] reverseArr = new String [array.length];
        int j = array.length;

        for(int i=0;i< array.length;i++){
            reverseArr[j-1] = array[i];
            j--;
            if(array[i]==reverseArr[i]){
                isPalin = true;
            }
        }

        return isPalin;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isPan = false;
        String concatString = "";

        for(int i=0;i<array.length;i++){
            concatString = concatString.concat(array[i]);
        }

        concatString = concatString.toLowerCase();


        for(char i='a';i<='z';i++){
            for(int j=0;j<concatString.length();j++){
                if(concatString.charAt(j)==i){
                    isPan = true;
                }
            }
            if(isPan==false){
                return false;
            }
            isPan = false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                count++;
            }
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> stringArrList = new ArrayList<String>();

        for(int i=0;i<array.length;i++){
            if(array[i] != valueToRemove){
                stringArrList.add(array[i]);
            }
        }

        String[] returnString = stringArrList.toArray(new String[stringArrList.size()]);
        return returnString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> stringArrList = new ArrayList<String>();

        for(int i=0;i<array.length-1;i++){
            if(array[i] != array[i+1]){
                stringArrList.add(array[i]);
            }
        }
        stringArrList.add(array[array.length-1]);

        String[] returnString = new String[stringArrList.size()];
        returnString = stringArrList.toArray(returnString);
        return returnString;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> myList = new ArrayList<String>();
        String holder = "";
        int count = 0;
        int countPlusOne = count + 1;

        while(count < array.length){
            holder = holder.concat(array[count]);
            while(countPlusOne < array.length && array[count].equals(array[countPlusOne])){
                holder = holder.concat(array[countPlusOne]);
                countPlusOne++;
            }
            myList.add(holder);
            holder = "";
            count = countPlusOne;
            countPlusOne++;
        }

        String[] returnStringArr = myList.toArray(new String[0]);
        return returnStringArr;
    }


}
