package com.tnsif.intro.day10;

public class stringdemo {

	public static void main(String[] args) {
		String s = new String ("Hello");
		String s1 ="Student";
		
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(1));
		System.out.println(s.indexOf('o'));
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
		
		StringBuffer sb = new StringBuffer("Hello World");
		StringBuffer sb1 = new StringBuffer("Hi World");
		
		System.out.println(sb);
		System.out.println(sb.replace(1, 4, "xxx"));
		System.out.println(sb.length());
		System.out.println(sb.charAt(3));
		System.out.println(sb.isEmpty());
		System.out.println(sb.equals(sb1));
		
        StringBuilder br = new StringBuilder("Hiii");
        System.out.println(br);
        
	}

}
