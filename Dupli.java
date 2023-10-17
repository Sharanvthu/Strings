
public class Dupli {
	static void removeDupli(String s)
	{
		String s1=new String();
		int length=s.length();
		for (int i = 0; i < length; i++) 
		{
			char c=s.charAt(i);
			if (s1.indexOf(c)>0) 
			{
				s1+=c;
			}
		}
		System.out.print(s1); 
	}


	public static void main(String[] args) 
	{
		String str="sharanabasava";

		removeDupli(str);



	}

}
