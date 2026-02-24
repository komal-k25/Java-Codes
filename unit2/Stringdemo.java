package unit2;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Hello";
		String str2 = "bye";
		
		//compareTo checks strings lexicographically
		if(str1.compareTo(str2)<0) {
			System.out.println(str2 + " is bigger");
		}else if(str1.compareTo(str2)>0) {
			System.out.println(str1 + " is bigger");
		}else {
			System.out.println("Equal strings");
		}
		
		//to ignore case and just compare
		if(str1.compareToIgnoreCase(str2)<0) {
			System.out.println(str2 + " is bigger");
		}else if(str1.compareToIgnoreCase(str2)>0) {
			System.out.println(str1 + " is bigger");
		}else {
			System.out.println("Equal strings");
		}
	}

}
