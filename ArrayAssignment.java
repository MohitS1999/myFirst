import java.util.*;
class ArrayAssignment{
	static int getmax(int []a){
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max){
				max=a[i];
			}
			}return max;
	}
	static int getmin(int []a1){
		int min=a1[0];
		for(int i=0;i<a1.length;i++){
			if(a1[i]<min){
				min=a1[i];
			}
			}return min;
	}
	static int getMax(int [][]b){
		int Max=b[0][0];
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				if(b[i][j]>Max){
					Max=b[i][j];
				}
			}
		}return Max;
	}
	static int getMin(int [][]b1){
		int Min=b1[0][0];
		for(int i=0;i<b1.length;i++){
			for(int j=0;j<b1.length;j++){
				if(b1[i][j]<Min){
					Min=b1[i][j];
				}
			}
		}return Min;
	}
	void sort(int []c){
		int temp=0;
		int m=0;
		for(int i=0;i<c.length;i++){
			m=i;
			for(int j=i+1;j<c.length-1;j++){
				if(c[j]<c[m]){
					m=j;
				}
			}
			temp=c[i];
			c[i]=c[m];
			c[m]=temp;	
		}
		for(int i=0;i<c.length;i++){
		System.out.println("Void Sort Array Max"+c[i]);
		System.out.println("  ");
		}
	}
	void sort2(int [][]d){
		Arrays.sort(d);
		for(int i=0;i<d.length;i++){
			for(int j=0;i<d.length;j++){
		System.out.println("void sort of 2d array :-  "+d[i][j]);
		System.out.println("  ");
		}
		}
	}
	void union(int x1[],int y1[]){
		int count=0;
		int w[]=new int[x1.length+y1.length];
		for(int i=0;i<x1.length;i++){
			w[i]=x1[i];
			count++;
		}
		for(int j=0;j<y1.length;j++){
			w[count++]=y1[j];
		}
		Arrays.sort(w);
		int []temp=new int[w.length];
		int j=0;
		for(int i=0;i<w.length-1;i++){
			if(w[i]!=w[i+1]){
				temp[j]=w[i];
				j++;
			}
		}
		w[j]=w[w.length-1];
		for( j=0;j<temp.length;j++){
		System.out.println(temp[j]+"  ");
	}
	}
	void intersection(int p[],int q[]){
		int cc=0;
		int m[]=new int[p.length+q.length];
		for(int i=0;i<p.length;i++){
			m[i]=p[i];
			cc++;
		}
		for(int j=0;j<q.length;j++){
			m[cc++]=q[j];
	    }
		Arrays.sort(m);
		int []temp=new int[m.length];
		int k=0;
		for(int i=0;i<m.length-1;i++){
			if(m[i]==m[i+1]){
				temp[k]=m[i];
				k++;
			}
		}
		m[k]=m[m.length-1];
		for( k=0;k<temp.length;k++){
			System.out.println(temp[k]+"  ");
		}
	}
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		printaction();
		boolean quit=true;
		while(quit){
		System.out.println("Enter your choice");
		int ch=s.nextInt();
		s.nextLine();
		switch(ch){
			case 1:int []a;
						System.out.println("enter the size of an array");
						int x3=s.nextInt();
						a=new int[x3];
						System.out.println("Enter the values of an Array");
						for(int i=0;i<a.length;i++){
							a[i]=s.nextInt();
						}
						int max=getmax(a);
						System.out.println("MAXIMUM VALUE:-  "+max);
						break;
			case 2:int []a1;
						System.out.println("enter the size of an array");
						int x4=s.nextInt();
						a1=new int[x4];
						System.out.println("Enter the values of an Array");
						for(int i=0;i<a1.length;i++){
							a1[i]=s.nextInt();
						}
						int min=getmin(a1);
						System.out.println("MINIMUM VALUEs:-  "+min);
						break;			
			case 3:int b[][];
						System.out.println("Enter row of an arrray");
						int y3=s.nextInt();
						System.out.println("Enter the column of an Array");
						int z3=s.nextInt();
						b=new int[y3][z3];
						System.out.println("Enter the values of an 2d Array");
						for(int i=0;i<b.length;i++){
							for(int j=0;j<b.length;j++){
								b[i][j]=s.nextInt();
								}
							}
						int Max=getMax(b);
						System.out.println("Max value of 2D Array:-  "+Max);
						break;
			case 4:int b1[][];
						System.out.println("Enter row of an arrray");
						int y=s.nextInt();
						System.out.println("Enter the column of an Array");
						int z=s.nextInt();
						b1=new int[y][z];
						System.out.println("Enter the values of an 2d Array");
						for(int i=0;i<b1.length;i++){
							for(int j=0;j<b1.length;j++){
								b1[i][j]=s.nextInt();
								}
							}
						int Min=getMin(b1);	
						System.out.println("MIn value of 2D Array:-  "+Min);
						break;
			case 5:int []a2;
						System.out.println("enter the size of an array");
						int x=s.nextInt();
						a2=new int[x];
						System.out.println("Enter the values of an Array");
						for(int i=0;i<a2.length;i++){
							a2[i]=s.nextInt();
						}
						ArrayAssignment ab=new ArrayAssignment();
						ab.sort(a2);
						break;
			case 6:int b4[][];
						System.out.println("Enter row of an arrray");
						int y5=s.nextInt();
						System.out.println("Enter the column of an Array");
						int z5=s.nextInt();
						b4=new int[y5][z5];
						System.out.println("Enter the values of an 2d Array");
						for(int i=0;i<b4.length;i++){
							for(int j=0;j<b4.length;j++){
								b4[i][j]=s.nextInt();
								}
							}
						ArrayAssignment ab1=new ArrayAssignment();
						ab1.sort2(b4);
						break;
			case 7:int x1[];
			       int y1[];
				   System.out.println("Enter the size of first Array");
				   int x2=s.nextInt();
				   x1=new int[x2];
				   System.out.println("ENTER the size of second Array");
				   int y2=s.nextInt();
				   y1=new int[y2];
				   System.out.println("Enter the elements of an first Array");
				   for(int i=0;i<x1.length;i++){
					   x1[i]=s.nextInt();
				   }
				   for(int j=0;j<y1.length;j++){
					   y1[j]=s.nextInt();
				   }
				   break;
			case 9:printaction();
					break;
			case 10:System.out.println("Thnku for using");
					quit=false;
					break;
			default:System.out.println("Please enter right key");		
		}
		}
		
	}
		private static void printaction()
		{
			System.out.println("print the action\n"+
            "1.for static max\n"+
            "2.for static min\n"+
			"3.for static 2d max\n"+
			"4.for static 2d min\n"+
			"5.for void sort for 1D array\n"+
			"6.for void sort for 2D array\n"+
			"7.for union\n"+
			"8.for intersection\n"+
			"9.for Showing the choice\n"+
			"10.for exit the program");
		}
		
		

		
		
		

	
	}
	

