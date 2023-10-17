
public class ReverseWord {
	public static String Reverse(String str)
	{
		String word[]=str.split("\\s");
		String reverseWord="";
		for(String s:word)
		{
			
			StringBuilder sb=new StringBuilder(s);
			sb.reverse();
			reverseWord+=sb.toString()+" ";
		}
		return reverseWord.trim()+" ";
	}

	public static void main(String[] args) {
		String s="My name is sharana";
		System.out.println(Reverse(s));

	}

}
