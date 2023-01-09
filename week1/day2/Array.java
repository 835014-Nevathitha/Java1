package week1.day2;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] mark= {21,23,45,56,78,98};
		String[] sub= {"eng" ,"tamil", "maths", "sci"};
		int length = mark.length;

		for(int i=0; i<length ; i++) {
			System.out.println(mark[i]);
		}
		
		for (int i=0; i<sub.length ; i++) {
			System.out.println(sub[i]);
		}

	}
}

