package capg.co;

public class Fruit 
{
	private String name;
	private int calories;
	private int price;
	private String color;
	
	public Fruit(String name, int calories, int price, String color) 
	{
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public int getCalories() {
		return calories;
	}

	public int getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}

	
	
	
}
