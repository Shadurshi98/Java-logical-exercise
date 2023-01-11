package Exercise1_1;

import java.util.Scanner;

public class Exercise1_4 {

	public static void main(String[] args) {
 int len;		
 Scanner x = new Scanner(System.in);
 System.out.print("enter the length");
len = x.nextInt();
int a[]=new int[len];
System.out.print("enter "  + len + " elements to store in array");
 for (int i=0; i< len ; i ++)
 {
	 a[i]=x.nextInt();
	 
 }
 System.out.print("reversed elemnts in array ");
 for(int i=len-1;i>=0;i--)
 {
	 System.out.print(a[i] + " ");
 }
 
	}

}
