package week1.day1;



public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=9;
		boolean bPrime = true;
		for (int i=2; i<num ; i++) {

			if( num % i==0) {

				System.out.println("its a not prime number");
				bPrime=false;
				break;
			}
		}
		if (bPrime==true) {
			System.out.println("its a prime number");
		}


	}

}
