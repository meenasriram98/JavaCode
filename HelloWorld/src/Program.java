
public class Program {
	
	public void zombie(int[] arr)
	{
		int energy=arr[0];
		int energy_lost=0;
		int temp=0;
		for(temp=1;temp<arr.length;temp++)
		{
			if(energy<arr[temp])
			{
				System.out.print("NO");
				break;
			}
			energy_lost=(arr[temp]%2)+(arr[temp]/2);
			energy-=energy_lost;
			
		}
		if(temp==arr.length)
		{
			System.out.print("YES");
		}
		
	}

}
