import java.util.Comparator;
import java.util.Scanner;

public class SortInt1 implements Comparator<T> {

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
		
	}

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
