package com.noc.base;

public class test {

	public static void main(String[] args) 
	{
		String x[][]= new String [2][2];
		System.out.println(x.length);//total no. of rows
		System.out.println(x[0].length);//total no. of column
		
		x[0][0] ="1" ;
		x[0][1] ="2" ;
		
		x[1][0]="5";
		x[1][1]="10";
		//int i;
		//int j;
		//
		//
		for (int i=0; i<x.length; i++) 
		{
			
		for ( int j=0;j<x[0].length; j++)	
		{	
	     //System.out.println(x[i][j]);
			
			System.out.print(x[i][j]+"  "); // to print in same line 
			
		
		}
		
		}
	}

}

