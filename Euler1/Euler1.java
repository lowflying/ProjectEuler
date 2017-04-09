
public class ET1 {
	public static void main (String [] args){
		int base = 0;
		int max = 1000;
		int total = 0;
		
		do{
			if(base%3 == 0){
		
			total = total+base;
			}
			base++;
		}while (max != base);
			
		System.out.println("Total for 3 and 5: " + total);
	}
}
