import java.io.IOException;

public class Break_Loop{
	static void eat() {
		 try{int data=50/0;//may throw exception  
    System.out.println("rest of the code...");  
	} catch(Exception e) {}
}
	  public static void main(String args[]) {  
		 Break_Loop.eat();
		  
	     


	}
}


