
class Stats<T extends Number>{
	T[] arr;
	
	Stats(T[] obj)
	{
		arr=obj;
	}
	
	 double average()
		{
			double sum=0;
			for (T t : arr) {
				sum+=t.doubleValue();	
			}
			return sum/arr.length;
		}
	
	 boolean sameAverage(Stats<?> obj)
	 {
		 if(average()==obj.average())
		 {
			 return true;
		 }
		 return false;
		 
	 }
	
}

