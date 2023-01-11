package Exercise1_1;


import java.util.Arrays;

public class Exercise1_7 {

	public static void main(String[] args) {
int a[]= {1,2,3,4};
System.out.println("original array" + Arrays.toString(a));
int x = a[0];
a[0]=a[a.length-1];
a[a.length-1]=x;
System.out.print("new array after swapping the first and last" + Arrays.toString(a));
	}

}
