import java.util.Scanner;

public class SortString 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] str=new String[n];
		String temp;
		System.out.println("Original string");
		for (int i = 0; i < str.length; i++)
		{
			str[i]=scan.next();
		}
try {
	

		for (int i = 0; i < str.length; i++) 
		{
			for (int j = i+1; j < str.length; j++) 
			{
				if(Integer.parseInt(str[i])>Integer.parseInt(str[j]))
				{
					temp=str[i];

					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
} catch (Exception e) {
	e.printStackTrace();;
}

System.out.println("Sorted string");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(str[i]+" ");
		}
	}

}
