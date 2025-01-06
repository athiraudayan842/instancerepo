package methods;

public class Palindrome {
int n=123;
int reverse=0;
int temp=n;
	public static void main(String[] args) {
Palindrome obj=new Palindrome();
obj.method1();
	}
public void method1()
{
	while(temp > 0)
	{
		int reminder=temp%10;
		reverse=(reverse *10)+reminder;
		temp=temp/10;
	}
	if(n==reverse)
	{
		System.out.println(" palindrome");
	}
	else
	{
		System.out.println("not palindrome");
	}
}

}

