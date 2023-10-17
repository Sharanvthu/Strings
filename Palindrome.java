
public class Palindrome 
{

	public static void main(String[] args) 
	{
		String s="MADA";
		/*String rev="";
		char[] ch=s.toCharArray();
		System.out.println("original string  :"+s);
		for (int i = ch.length-1; i>=0 ; i--) 
		{
			rev=rev+ch[i];
		}
		System.out.println( "Reversed string  :"+ rev);

		if(s.equals(rev))
			System.out.println("PALINNDROME");
		else
			System.out.println("NOT PALINDROME");
		System.out.println("======================================");
		System.out.println("Total number characters in string   :"+s.length());
		System.out.println("======================================");
		System.out.println("Lower case of string  :"+rev.toLowerCase());
		String low=s.toLowerCase();
		System.out.println("======================================");
		System.out.print("not considered case   :");
		if(s.equalsIgnoreCase(rev))
			System.out.println("PALINNDROME");
		else
			System.out.println("NOT PALINDROME");*/
		StringBuilder s1=new StringBuilder(s);

		System.out.println(s1);
		s1=s1.reverse();
		System.out.println(s1);
		if(s .equals(s1))
			System.out.println("palin");
		else
			System.out.println("not palin");
		/*System.out.println(s1);
		System.out.println(s2);
		System.out.println(s.hashCode());
		System.out.println(s2.hashCode());*/
		System.out.println("==================");
		System.out.println(s);
		System.out.println("=============");
		System.out.println(s1);
		System.out.println("=============");
	}
}