// Leetcode 151
class Solution {
    //split the string based on spaces
    
    public String reverseWords(String str) {
         String [] words =str.trim().split("\s+"); //\s is white space character
         //trim:- leading & traailing spaces :discard
         // split on multiple spaces : single split
        StringBuilder res = new StringBuilder()
;
     for(int idx=words.length -1; idx>=0; idx--){
         if(idx< words.length -1){
             res.append(" ");
             // above two line is written because no space before first word
         }
         res.append(words[idx]);
         
     }
        return res.toString()
; // here also I can able to use trim but need to remove first written trim.
    }
    }
//Time Complexity O(n)
// Space Complexity O(n)// extra space (array)