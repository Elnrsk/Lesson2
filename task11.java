public class task11{
	public static void main(String[] args) {
		int x=5;
		int b=3;
		int y=9;
		int f=7;

		int p=x*y+b;
		int s=x+y*f;

		System.out.print("total is "+s*s+p*(s-x)*(p+y)/f);
	}
}