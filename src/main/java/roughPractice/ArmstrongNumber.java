package roughPractice;

public class ArmstrongNumber 
{

	static void armStrong (int num)
	{
		
		// 1cube + 5cube+ 3 cube = 153
		
		
				int rem;
				int cube= 0;
				int temp;
				
				temp=num;
				
				while (num>0)
				{
					rem= num%10;
					num= num/10;
					cube = cube + (rem*rem*rem);
				}
				
				if (temp==cube)
				{
					System.out.println("Number is Armstrong");
				}
			
	}
	
	public static void main(String[] args) 
	{
		armStrong(153);

		
	}

}
