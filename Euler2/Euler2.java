
public class Euler2 {
	public static void main (String[] args){
		//int max = new fibonacci();
		System.out.println(fibonacci());
	}
	
	public static int fibonacci(){
		int number = 9;
		int fibo1 = 1, fibo2 = 2, fibonacci = 1;
		int sum = 0;
		
		do{
			fibonacci = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = fibonacci;
			if(fibonacci%2 == 0){
				sum = sum + fibonacci;
			}
			
			
		}while(fibonacci<=4000000);
		return sum;
	}
}
