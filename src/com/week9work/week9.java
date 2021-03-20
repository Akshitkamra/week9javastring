package com.week9work;

import java.util.HashSet;
import java.util.Set;

public class week9
{
    public static void main(String[] args) {
        String str = "Welcome to Lambton College";
        System.out.println("Length : " + str.length()); //26

        str = str.concat(" Toronto"); //Welcome to Lambton College Toronto
        //str = str.toLowerCase(); //welcome to lambton college toronto
        //str = str.toUpperCase(); //WELCOME TO LAMBTON COLLEGE TORONTO

        System.out.println(str);

        //Extract the word Lambton
        String findString = "Lambton";
        int indexOfFindString = str.indexOf(findString);
        String lambton = str.substring(indexOfFindString, indexOfFindString + findString.length());
        System.out.println(lambton);

        System.out.println(str.substring(27));
        System.out.println(str.substring(11, 18));

        //Check the word "College" is exist or not
        String wordToFind = "College";
        System.out.println(str.contains(wordToFind));
        System.out.println(str.indexOf(wordToFind));
        if(str.indexOf(wordToFind) >=0 ) {
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }

        StringBuffer buffer = new StringBuffer();
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
        buffer.append(str);
        System.out.println(buffer.capacity());
        System.out.println(buffer.length());
        buffer.reverse();
        System.out.println(buffer);
        System.out.println(buffer.toString()); //Convert to String Object
        //buffer.append(100);
        //Replace "Toronto" => ", Toronto"
        //buffer.replace(27,34,",Toronto");
        //public StringBuffer replace(int first, int last, String st)
        //System.out.println(buffer.replace("Toronto", ", Toronto"));

        //Find No. of words in given string str

        //String s = null;
        //String s = new String();
        //String s = "Welcome Leo";
        String s = "    Welcome     Leo   ";
        System.out.println("No. Of Words : " + findNoOfWords(s));
        Set<String>newString = new HashSet<>();
        for(String a : s.split(" ")) {
            newString.add(a);
        }
        System.out.println("No. Of Words By Set: " + (newString.size() - 1));

        Integer i = 10; // Auto Boxing
        int x = i;      // Unboxing
        System.out.println(i);
        System.out.println(x);


        /// Str = "hello hello how Are you HELLO are there happy test you"
        //o/p hello -> 3, how -> 1 are -> 2, you -> 2, there -> 1, happy -> 1, test -> 1

    }
        //hello world
    static int findNoOfWords(String str){
        if(str == null)
        {
            return  -1;
        }

        if(str.length() == 0){
            return 0;
        }

        str = str.trim();

        int wordCount = 1;
        char []strWords = str.toCharArray();

        for(int i = 0; i < strWords.length; i++)
        {
            /* if(Character.isWhitespace(strWords[i])){
                wordCount++;
            }*/

           /* if(strWords[i] == 32){
                wordCount++;
            }*/

            if(strWords[i] == ' '){
                wordCount++;
            }
        }

        return wordCount;
    }
}
