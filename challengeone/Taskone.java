package challengeone;

public class Taskone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "luffy is still joyboy";
		String lastWord = s.substring(s.lastIndexOf(" "));

		int length = 0;
		
		for(int i=0; i<s.length(); i++) {
			if (s.charAt(i) == ' ')
	            length = 0;
	        else
	            length++;
			
		}
		 System.out.println("The last word is "+lastWord+" with length " + length);

	}

}
