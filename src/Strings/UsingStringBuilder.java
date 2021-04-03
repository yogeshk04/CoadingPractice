package Strings;

public class UsingStringBuilder {
	public static void main(String[] args) {
		String input = "Indian Team wins";
		
		StringBuilder strb = new StringBuilder();
		
		strb.append(input);
		
		strb.reverse();
		
		System.out.println(input);
		System.out.println(strb);
	}

}
