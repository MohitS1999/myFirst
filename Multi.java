// finding the max product of three no in the array

import java.util.*;

class Multi
{

public static void main(String as[])   
   {
       int str[],max=0;
        System.out.println("Enter the size of the array");  
		int x=new Scanner(System.in).nextInt();
	 
	    str=new int[x];// most important line ever in case of java
		
		System.out.println("Enter arry elements");
		for(int i=0;i<str.length;i++)
		{
		 str[i]=new Scanner(System.in).nextInt();
		}
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				for(int k=j+1;k<str.length;k++)
				{
				  int product=str[i]*str[j]*str[k];
				  if(product>max)
				  {
				    max=product;
				  }
				}
			}	
		}	
	System.out.println("maximum of product of three no is= "+max);
   }
}  