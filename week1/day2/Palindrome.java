package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "madam";
		String rev = "";
		char[] charArray = name.toCharArray();
		for(int i=charArray.length -1 ;i>=0 ; i--) {
			rev= rev+charArray[i];
		}
		if(name.equals(rev)) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
	}

}
