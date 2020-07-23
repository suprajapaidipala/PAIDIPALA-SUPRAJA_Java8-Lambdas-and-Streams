package com.supraja.epamtask10_Supraja;

import java.util.List;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringFilter 
{
	private List<Object> filStr;
	public static void main( String[] args )
    {
		String[] stringCheck= {"null","abb","sifdjsdf","aef","asd","qwerty","popo","acb"};
        List<String> strings=Arrays.asList(stringCheck);
        StringFilter filterString=new StringFilter();
        filterString.fil(strings);
        System.out.println("list of all strings that start with the letter 'a' (lower case) and have exactly 3 letters");
        filterString.display(System.out::println);
        System.out.println();
    }
	
	
	public void fil(List<String> list)
	{
		Stream<String> stream=list.stream();
        this.filStr=stream.filter((t)->
        {
        	if(t.length()==3 && t.charAt(0)=='a')
        	{
        		return true;
        	}
        	else
        	{
        	return false;
       		}
        }).collect(Collectors.toList());
	}
	
	public void display(Consumer<String> consumer)
    {
    	for(Object str:filStr)
    	{
    		consumer.accept((String) str);
    	}
    }
}