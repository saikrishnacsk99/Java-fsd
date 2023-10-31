package phase1_3projects;
public class RangeSum {
	
	static int sumNatural(int n)
	{
	int sum = (n * (n + 1)) / 2;
	return sum;
	}

	static int suminRange(int l, int r)
	{
	return sumNatural(r) - sumNatural(l - 1);
	}
	
	public static void main(String[] args)
	{
	int l = 7, r = 10;
	System.out.println("Sum of Natural numbers from L to R is"+suminRange(l, r));
	
	}
}
