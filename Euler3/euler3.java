import java.util.ArrayList;
import java.io.*;

public class Euler3{
	public static void main(String args[]){
		int test = 13195;
		int testResult = 0;
		 BufferedReader input = 
      new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList results = new ArrayList();
		for(int i = 2; i < test/2; i++){
			int temp = 1;
		    if(test%i == 0){
			   
				testResult = test % i;
				results.add(i);
				
				
				for(int j = 0; j < results.size(); j++){
					temp *= (int)results.get(j);
				}
				if(temp == test){
					break;
				}
		   }
		   
		   
		}	
		results.forEach((a)->System.out.println(a));
		
		try {
			input.readLine();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}