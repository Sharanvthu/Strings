
public class PalinWords {
	static int count;
	static int rem;
	static int length;
	public static String palin(String s)
	{
		String a[]=s.split("\\s");
		String palinWord="";
		String reverse="";
		length=s.length();
		StringBuilder revStr=new StringBuilder(s);
		revStr.reverse().toString();
		for(String str:a)
		{
			StringBuilder sb=new StringBuilder(str);
			sb.reverse();
			
			reverse+=sb.toString()+" ";
			
			if(str.equalsIgnoreCase(sb.toString()))
			{
				++count;
				palinWord+=sb.toString()+"\n";
				 

			}
			rem=a.length-count;
		}

		return ""+"1--->"+count+
				" words are palindrome in sentence and they are: \n"
		+palinWord+"\n"
		+"2--->Reverse words of given String:\n\t "+reverse+"\n"
		+"3--->"+rem+" words are not palin\n"+
		"4--->Total number of characters in String is:"+length+"\n"+
		"5--->Reverse of given String is below:\n\t"+revStr;

	}

	public static void main(String[] args) {
		String str="hi iam from gadag and i can speak malayalam";
		System.out.println("Original String:\n"+str);
		System.out.println(palin(str));

	}

}
