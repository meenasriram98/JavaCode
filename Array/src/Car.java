
class Car implements Comparable<Car>{
	
	private String brand;
	private int price;
	private int year;
	
	Car(String brand,int price,int year)
	{
		this.brand=brand;
		this.price=price;
		this.year=year;
	}
	
	public String getBrand()
	{
		return this.brand;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	public int getYear()
	{
		return this.year;
	}


	@Override
	public int compareTo(Car obj) {
		return obj.getYear()-this.getYear();
	}
	
	
}
