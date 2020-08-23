package main.java;

import java.util.Scanner;

public class tester1 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter the lower range and higher range");
		int lb= s1.nextInt();
		int ub= s1.nextInt();
		if (lb>ub)
		{
			lb=lb+ub;
			ub=lb-ub;
			lb=lb-ub;
		}

		int count=0;
	      
	    for (int num=lb;num<=ub;num++)
		   {   
	            if(num%2!=0 )
			     {		         	
	            	    	
	               	   if(count==50 )
	                     {
	               		   break;
	               		 }
	               	System.out.println(num);
	              }
	            count++; 
	              // System.out.println(count);
	          
			}
	    
	}
	}


