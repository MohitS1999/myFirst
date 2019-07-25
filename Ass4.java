import java.util.*;
public class Ass4{
	public static void main(String[] args){
		Scanner s1=new Scanner(System.in);
		int z[];
		System.out.println("Enter the size of Array");
		int x=s1.nextInt();
		z=new int[x];
		System.out.println("Enter the values of array");
		for(int i=0;i<z.length;i++){
			z[i]=s1.nextInt();
		}
		//Arrays.sort(z);
		int temp=0;
		int min=0;
		for(int i=0;i<z.length;i++){
			min= i;
			for(int j=i+1;j<z.length;j++){
				if(z[j]<z[min]){
					min=j;
				}
			}
			temp=z[i];
			z[i]=z[min];
			z[min]=temp;
		}
		for(int i=0;i<z.length;i++){
			System.out.println(z[i]);
			System.out.println("   ");
		}
		System.out.println("which smallest element you want to find at kth position");
		int k=s1.nextInt();
		System.out.println(z[k-1]);
	}
}