import java.util.Scanner;


public class Day {

	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     System.out.println("enter the working day : ");
     String s1=in.nextLine();
     String s2="sunday";
     if(s1.equals(s2)){
    	 System.out.println("false");
     }
     else
     {
    	 System.out.println("true");
     }
     
   
}
}
