package com.codingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ClassB  {

	public static void main(String[] args) {
		
		String str = "maniaan";
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			set.add(str.charAt(i));
		}
		for(  Character c:set){
			System.out.print(c);
		}
}
}





