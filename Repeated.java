import java.util.Scanner;
public class Repeated {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int a[]=new int[n];
   
    int b=0;
    for(int i=0;i<a.length;i++){
      a[i]=in.nextInt();
    for(int j=i+1;j<a.length;j++){
    	if(a[i]!=a[j]){
    		b=a[i];
    }
    }
    }System.out.println(b);
	}

}
