import java.util.*;
public class Ass3{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int z[];
		System.out.println("Enter the size of an array");
		int x=s.nextInt();
		z=new int[x];
		System.out.println("Enter the value of an array");
		for(int i=0;i<z.length;i++){
			z[i]=s.nextInt();
		}
		System.out.println("------------------");
		Arrays.sort(z);
		int j=0;
	  int []temp=new int[z.length];
			 for(int i=0; i<z.length-1; i++){
				if(z[i]!=z[i+1]){
					temp[j]=z[i];
					j++;
				}
			 }	
			 z[j]=z[z.length-1];
			 for(j=0;j<temp.length;j++){
              System.out.println(temp[j]);
	}}
}
