import java.util.Scanner;

public class SortInt {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] str=new int[n];
		int temp;
		System.out.println("Original array");
		for (int i = 0; i < str.length; i++)
		{
			str[i]=scan.nextInt();
		}
		for (int i = 0; i < str.length; i++) 
		{
			for (int j = i+1; j < str.length; j++) 
			{
				if(str[i]>str[j])
				{
					temp=str[i];

					str[i]=str[j];
					str[j]=temp;
				}
			}
		}


		System.out.println("Sorted array");
		for (int i = 0; i < str.length; i++) 
		{
			System.out.print(str[i]+" ");
		}
	}

}


