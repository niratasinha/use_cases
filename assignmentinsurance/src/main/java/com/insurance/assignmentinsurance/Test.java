package com.insurance.assignmentinsurance;

public class Test {
public static void main(String args[])
{
	String S1="Hi";
	String S2="Hi";
	String S3 = new String("Hi");
	System.out.println(S1==S2);
	System.out.println(S1==S3);
	System.out.println(S1.equals(S2));
	System.out.println(S1.equals(S3));
}
}
