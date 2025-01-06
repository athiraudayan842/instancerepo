package methods;

public class Factorial {
	int num=5;
	int fact=1;
	public static void main(String[] args) {
	Factorial obj=new Factorial();
obj.sample1();
	}
public void sample1()
{
	for(int i=1;i<=5;i++)
	{
		fact=fact*i;
		}
	System.out.println("Factorial of 5 ="+ fact );
	}
}

