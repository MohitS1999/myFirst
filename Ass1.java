import java.util.*;
class Ass1{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		HashSet<Integer> hs= new HashSet<>();
		int z[];
		System.out.println("Enter the size of an array");
		int x=s.nextInt();
		z=new int[x];
		System.out.println("Enter the values of an arrary");
		for(int i=0;i<z.length;i++){
			z[i]=s.nextInt();
		}
		for(int i=0;i<z.length;i++){
			hs.add(z[i]);
		}
		System.out.println(hs);
	}
}