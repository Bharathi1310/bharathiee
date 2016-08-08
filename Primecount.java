public class Primecount {
public static void main(String[] args){
	int count=0;
	for(int n=0;n<100;n++){
		
	    int flag=0;
	  for(int j=2;j<n;j++)
	    {
	    if(n%j==0){
	     flag=1;
	     break;
	     }
	     }
	     if(flag==0){
	    	 count++;
	    }     
	    }
	   System.out.println("count is :" +count);
}
}
