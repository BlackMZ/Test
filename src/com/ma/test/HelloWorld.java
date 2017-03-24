package com.ma.test;
/**
 * @ClassName: HelloWorld  
 * @Description: this is a test file.  
 * @author MZ  
 * @2017年3月22日下午6:34:23
 */
public class HelloWorld {

	public static void main(String[] args) {
		
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
	            'i', 'n', 'a', 't', 'e', 'd'};
	            
	    char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
	        
	        System.out.println(new String(copyTo));
	    }
	
	}
