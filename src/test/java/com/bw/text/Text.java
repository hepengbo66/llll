package com.bw.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import utils.StringUtil;

public class Text {
	
	public static boolean isEmpty(Collection<?> ser){
		 return ser.isEmpty();
		 
	 }
	
	
	public static void main(String[] args) {
		
		Set<Integer> src = new HashSet<Integer>();
		//src.add(1);
		System.out.println(isEmpty(src));
		
		
		System.out.println(StringUtil.isEmpty(""));
		System.out.println(StringUtil.isEmpty(" "));
		System.out.println(StringUtil.isEmpty("456"));
		
		
		
	}
	
}
