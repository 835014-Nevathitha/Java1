package challengeone;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 4;
		double temp;
		double squrt=value/2;
		
		do { 
			temp=squrt;
			squrt = (temp+(value/temp))/2;
			}
		while((temp-squrt)!=0);
		// double was converted into int
		System.out.println((int)squrt);
	}

}
