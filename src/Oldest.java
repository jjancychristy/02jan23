
public class Oldest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=38;
int b=20;
int c=34;
if(a>=b && a>=c) 
{
		System.out.println("a is greater");
		
		if(b>c) {
			System.out.println("c is youngest");
		}
		else
		{
			System.out.println("b is youngest");
		}
			
		}
else if (b>=a && b>=c)  
{
System.out.println("b is greater");

if(a>c) {
	System.out.println("c is youngest");
}
else
{
	System.out.println("a is youngest");
}
	}
else 
{
	System.out.println("c is greater");
	if(a>b)
		
	{
		System.out.println("b is youngest");
	}
	
	else
	{
		System.out.println("a is youngest");
	}
}


	
	
	}
	}