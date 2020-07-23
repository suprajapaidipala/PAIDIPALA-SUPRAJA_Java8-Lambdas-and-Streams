package com.supraja.epamtask10_Supraja;

import java.util.*;
import java.util.stream.IntStream;

public class Palindrome 
{
    public static void main(String[] args) 
    {
        List<String> InitialList = new ArrayList<String>();
        InitialList.add("redivider");
        InitialList.add("level");
        InitialList.add("racecar");
        InitialList.add("madam");
        InitialList.add("abcd");
        InitialList = palindrome(InitialList);
        for (String i : InitialList)
            System.out.println(i);
    }

    static List<String> palindrome(List<String> InitialList) 
    {
        List<String> PalindromeList = new ArrayList<String>();
        for (String i : InitialList) 
        {
            String t = i.replaceAll("\\s+", "").toLowerCase();
            if (IntStream.range(0, t.length() / 2).noneMatch(j -> t.charAt(j) != t.charAt(t.length() - j - 1)))
                PalindromeList.add(i);
        }
        return PalindromeList;
    }
}