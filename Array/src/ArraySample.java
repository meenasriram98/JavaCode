import java.util.Collections;

public class ArraySample {
	public static void main(String[] args)
	{
		int[][] array1=new int[5][5];
		int even_number=2;
		int odd_number=1;
		int outer=0,inner=0;
		for(outer=0;outer<array1.length;outer+=2)
		{
			for(inner=0;inner<array1.length;inner++)
			{
				
					array1[inner][outer]=even_number;
					even_number+=2;
					
			}
			
			
		}
		for(outer=1;outer<array1.length;outer+=2)
		{
			for(inner=0;inner<array1.length;inner++)
			{
				
					array1[inner][outer]=odd_number;
					odd_number+=2;
								
			}
		}
		
		for(outer=0;outer<array1.length;outer++)
		{
			for(inner=0;inner<array1.length;inner++)
			{
					System.out.print(array1[inner][outer]);
			}
			System.out.println();
		}
		
		
	}

}
