
public class Euler1 {
	public static void main (String [] args){
		int max = 1000;
		int base3 = 1;
		int base5 = 1;
		int numerator3 = 3;
		int numerator5 = 5;
		int denominator3;
		int denominator5;
		int total = 0;
		int total3 = 0;
		int total5 = 0;
				
		do{
			denominator3 = (base3%numerator3);
			denominator5 = (base5%numerator5);
			if(denominator3 == 0 && denominator5 == 0){
				total3 = (total3 + base3);
				total5 = (total5 + base5);
				total = (total + base3 + base5);
			}
			base3++;
			base5++;
		}
		while(base5 != max);
		
		System.out.println("Total for 3 = " + total3);
		System.out.println("Total for 5 = " + total5);
		System.out.println("Total for both = " + total);
	}
}
