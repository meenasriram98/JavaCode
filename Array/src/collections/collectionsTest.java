package collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class collectionsTest {
	
	public static void main(String[] args)
	{
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "meena");
		map.put(2, "teju");
		map.put(3,"mounika");
		
		for (Map.Entry<Integer , String> entry : map.entrySet()) {
			System.out.println(entry);
		}
		
		Collection<String> names=map.values();
		names.stream().forEach(temp->System.out.println(temp));
		Set<Integer> key=map.keySet();
		
		List<String> names1 = 
                Arrays.asList("Meena","abc","Zeus"); 
  
        // demonstration of filter method 
        List<String> result1 = names1.stream().filter(s->s.startsWith("M")). 
                          collect(Collectors.toList()); 
        System.out.println(result1); 
        
        //example of  map,filter and collect
        List<String> nums = Arrays.asList("1", "2", "3", "4", "5", "6");

        System.out.println("original: " + nums);

        List<Integer> even = nums.stream()

                                    .map(s -> Integer.valueOf(s))

                                    .filter(number -> number % 2 == 0)

                                    .collect(Collectors.toList());

        System.out.println("only even numbers: " + even);


		
		
		
	}

}
