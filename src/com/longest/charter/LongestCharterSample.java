package com.longest.charter;

public class LongestCharterSample {

	public static void main(String[] args) {
	        String s = "rcvghaaabbbbbccbbcccc";
	        Result result = findLongestOccurrence(s);

	        if (result != null) {
	            System.out.println("Longest occurring character is '" + result.character + "' with length " 
	                                + result.length + " at index " + result.index + ".");
	        } else {
	            System.out.println("The string is empty.");
	        }
	    }

	    public static Result findLongestOccurrence(String s) {
	        if (s == null || s.isEmpty()) {
	            return null;
	        }

	        char maxChar = ' ';
	        int maxLength = 0;
	        int maxIndex = -1;

	        char currentChar = s.charAt(0);
	        int currentLength = 1;
	        int currentIndex = 0;

	        for (int index = 1; index < s.length(); index++) {
	            char charAtI = s.charAt(index);
	            if (charAtI == currentChar) {
	                currentLength++;
	            } else {
	                if (currentLength > maxLength) {
	                    maxChar = currentChar;
	                    maxLength = currentLength;
	                    maxIndex = currentIndex;
	                }
	                currentChar = charAtI;
	                currentLength = 1;
	                currentIndex = index;
	            }
	        }

	        // Final check at the end of the loop
	        if (currentLength > maxLength) {
	            maxChar = currentChar;
	            maxLength = currentLength;
	            maxIndex = currentIndex;
	        }

	        return new Result(maxChar, maxIndex, maxLength);
	    }

}
