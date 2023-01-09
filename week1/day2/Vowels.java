package week1.day2;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String name= "GOOGLE";
		name= name.toLowerCase();
		
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='a'||
					charArray[i]=='e'||
					charArray[i]=='i'||
					charArray[i]=='o'||
					charArray[i]=='u') {
					
				System.out.println("vowels:"+charArray[i]);
			}
		}
		
		
		
	}

}
