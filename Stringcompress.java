public class Stringcompress {
	public static void main(String[] args) {
		StringBuilder result = new StringBuilder();
		String str1="abaabccc";
		int count=1;
		int prev=0;
		for(int i=1;i<=str1.length();i++) {
		if(i<str1.length()&& str1.charAt(i)==str1.charAt(i-1)) {
			count++;
		}else {
			result.append(str1.charAt(i-1)).append(count);
		    count=1;
		    prev=0;
		}	
	}
	System.out.println(result.toString());
	System.out.println(str1);
}}