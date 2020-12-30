
//string methods          ------index positions----> 0 1 2 3 4 5 6 7 8 9 10
//                         ------ string ---->       M a n u   M a t h e w

package com.company;


public class CWH14_String_methods {
    public static void main(String[] args) {
        System.out.println("Explanatiom of String methods");
        /*
        .length()
        .toLowerCase()
        .toUpperCase()
        .trim()
        .substring()
        .replace()
        .startsWith(string or character)
        .endsWith(string or character)
        .charAt(index)
        .indexof(STRING OR LETTER)
        .indexof(string:, fromindex:)
        .equals
        .equalsIgnoreCase(anotherstring: stringname)
        */
        String name = "Manu Mathew";
        System.out.println(name.length()); //variable.length() -->to find the length of string. Returns integer data.
        System.out.println(name.toLowerCase());//variable.toLowercase()-->to convert all capital letters to small letters. Returns strings.
        System.out.println(name.toUpperCase());//variable.toUppercase()-->to convert all small letters to capital letters. Returns strings.
        String name2 = "       Manu Mathew       ";
        System.out.println(name2);
        System.out.println(name2.trim());// removes space from both the sides. Returns strings.
        System.out.println(name.substring(7)); // works the same as string slicing in python name[7:]. Returns strings.
        System.out.println(name.substring(7,10)); // works the same as string slicing in python name[7:(10-1)]. Returns strings.
        System.out.println(name2.replace(" ",""));//variable.replace(t,r) where t=target and r =replacement where the all the target is replaced by replacement. This method only works for characters. Returns strings.
        System.out.println(name.replace("Ma","Nam"));//This method only works for strings. Returns strings.
        System.out.println(name.startsWith("Man"));//works for single character as well as strings. Returns boolean value ie, true or false
        System.out.println(name.endsWith("hew"));//works for single character as well as strings. Returns boolean value ie, true or false
        System.out.println(name.charAt(2));//returns the charater at index 2.
        System.out.println(name.indexOf("thew"));// works for single charater and strings. Returns the index of the first occurence of the character or the first occurence of the string in the given string. Returns integer datatyoe.
        System.out.println(name.indexOf("theeee"));// returns -1 as there is no such substring in that string
        System.out.println(name.indexOf("Ma",5));// returns 5 as it starts searching substring 'Ma' from index 5. Here the iteration starts from the begining.
        System.out.println(name.lastIndexOf("Ma",7));// returns 5. HEre the iteration starts from the back side.
        System.out.println(name.equals("Manu Mathew"));//returns boolean data type . Basically used to equalize string datatype.
        System.out.println(name2.equals("Manu Mathew"));
        System.out.println(name.equalsIgnoreCase("manu mathew"));// ignores the lower case and upper case and returns a boolean data type.
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Explanation on escape sequence");
//        \t ----->inserts a tab space character
//        \b ----->inserts a backslash character
//        \n ----->inserts a newline character
//        \r ----->inserts a carriage return
//        \f ----->inserts a form feed
//        \' ----->inserts a single quote
//        \" ----->inserts a double quote
//        \\ ----->inserts a backslash character
        System.out.println("I am the charater knw as \t tabspace.");
        System.out.println("I am the charater known as \b backspace.");
        System.out.println("I am the charater known as \n newline.");
        System.out.println("I am the charater known as \r carriage return.");
        System.out.println("I am the charater known as \f formfeed."); // inserts 
        System.out.println("I am the charater known as \' singlequote.");
        System.out.println("I am the charater known as \" doublequote.");
        System.out.println("I am the charater known as \\ backslash.S");
    }
}
