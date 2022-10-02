package externalFiles;

public class GenericMethod {
	public static void main(String[] args) {
		Integer[] num = {12,23,45,67,78};
		Double[] dob = {12.3,1.4,3.5};
		String[] words = {"apple","boy"};
		array(num);
		array(dob);
		array(words);
		
	}
	public static <E> void array(E[] arr) {//E for element type
		for(E item:arr) {
			System.out.println(item);
		}
	}

}
