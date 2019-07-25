//hi there i am mooohhito

 /*Given two arrays sort the values of one array using the second array.
	input string Array1[]={"a","b","c","d","e","f","g","h","i"}
	int arr2[]={0,1,1,0,1,2,2,0,1}
	output:{"a","d","h","b","c","e","i","f","g"}
	
	input string Array1[]={"g","e","e","k","s","f","o","r","g","e","e","k","s"}
	int arr2[]={0,1,1,0,1,2,2,0,1}
	output:{"g","k","r","e","e","g","s","f","o"}*/
import java.util.*;	
	class Aa
	{
		char array1[];
		int array2[]={0,1,1,0,1,2,2,0,1};
		int s;
		Aa()
		{
			System.out.println("enter size of array");
			s=new Scanner(System.in) .nextInt();
			array1=new char[s];
			System.out.println("enter the input array");
			
			for(int i=0;i<array1.length;i++)
			{
				array1[i]=new Scanner(System.in) .next().charAt(0);
			}
		}
		 
		void sort()
		{
			int n,i,j;
			n=0;
			while(n<=2)
			{
				for(j=0;j<9;j++)
				{
					if(array2[j]==n)
					{
						System.out.print(array1[j]+" ");
					}
				}
				n++;
			}
			System.out.println(" ");
		}
		public static void main(String arg[])
		{
			Aa z=new Aa();
			z.sort();
			Aa z1=new Aa();
			z1.sort();
		}
	}
	
			
	
			
				
					
				
				
				
			
				
		
					
				
				
		
		
	
	