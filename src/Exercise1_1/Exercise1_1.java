package Exercise1_1;

public class Exercise1_1 {

	public static void main(String[] args) {
int[] myNum = {1,2,3,4,5,6,7,8,9,10};
int sum =0;

for (int i=0;i<myNum.length;i++) {
	
	sum= sum + myNum[i];
	}
	double average = sum / myNum.length;
System.out.print("The average is :" + average);




	}

}
