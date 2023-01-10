package Exercise1_1;

public class Exercise1_2 {

	public static void main(String[] args) {
         String x ="string";
         String y ="";
         
         for(int i= 5;i>= 0;i--) {
        	 y =y + x.charAt(i);
        	 
         }
         
         System.out.print(y);
         
         if (x.equals(y))
              System.out.print("string is a palindrome");
         else
            System.out.print("string is not a palindrome");  
	}

}
