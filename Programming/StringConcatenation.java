package com.Collectionframework.Programming;

public class StringConcatenation {
    public static void main(String[] args) {
        String st1 = "New Delhi";
        String st2 = "America";
        String st3 = "USA";
        System.out.println(Concate(st1, st2, st3));
    }

    public static String Concate(String... str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" "); 
        }
        return sb.toString().trim(); 
    }
}
