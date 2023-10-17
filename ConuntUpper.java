
public class ConuntUpper {
	static int count = 0;
	public static void main(String[] args) 
	{
		
		String s="ShAraNa";
		char[] ch=s.toCharArray();
		for (int i = 0; i < ch.length-1; i++)
		{
			if(ch[i]>=97 && ch[i]<=122){
			++count;}
		}
		System.out.println(count);
	/*	for (int i = 0; i < ch.length-1; i++)
		{
			if(ch[i]==65||ch[i]==69||ch[i]==73||ch[i]==79||ch[i]==86)
			{
				++count;
			}
		}
		System.out.println(count);*/

	}

}
