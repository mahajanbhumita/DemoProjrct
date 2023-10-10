package com.tka.bufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {
public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your name: ");
		String name=br.readLine();
		System.out.println("Welcome "+name);
		System.out.println("Enter your salary: ");
		double salary=Double.parseDouble(br.readLine());
		System.out.println("Your salary is= "+salary);
		
		//1.toUpperCase and toLowerCase
		System.out.println("----------------------------------------");
		System.out.println("In uppercase and lowercase method ");
		System.out.println( "toUpperCase()-->"+name.toUpperCase());
		System.out.println("toLowerCase()-->"+name.toLowerCase());
		
		//2.charAt()-->It returns the character at specified value
		System.out.println("character at 2 index-->"+"charAt()-->"+name.charAt(2));
		
		//3.trim()-->It removes white spaces before and after string
		System.out.println("----------------------------------------");
		System.out.println("In trim() method ");
		System.out.println("Enter your name: ");
		String name1=br.readLine(); 
		System.out.println("trim()-->"+name1.trim());
		
		//4.replace()--> replace() method replaces all occurrence of first sequence of character with second sequence of character.
		System.out.println("----------------------------------------");
		System.out.println("In replace() method ");
		System.out.println("Enter String: ");	
		String s=br.readLine();
		String replaceString=s.replace("a", "p");
		System.out.println(replaceString);
		
		//5.isEmpty()-->isEmpty() method checks if the input string is empty or not.if empty returns true else false
		System.out.println("----------------------------------------");
		System.out.println("In isEmpty() method ");
		System.out.println("Enter empty String: ");
		String string=br.readLine();
		boolean isEmpty=string.isEmpty();
		System.out.println(isEmpty);
		
		//7.Equals() method-->It compares two string and if they are equal then return true else false
		System.out.println("----------------------------------------");
		System.out.println("In eqauls() method ");
		System.out.println("Enter first string: ");
		String s1=br.readLine();
		System.out.println("Enter second string: ");
		String s2=br.readLine();
		System.out.println(s1.equals(s2));
		
		//8.split-->split() method splits this string against given regular string and returns a char array.
		System.out.println("----------------------------------------");
		System.out.println("In split() method");
		System.out.println("Enter string: ");
		String s3=br.readLine();
		String[] sp=s3.split("\\s");
		for(String splitString:sp) {
			System.out.println(splitString);
		}
		
	}
}
