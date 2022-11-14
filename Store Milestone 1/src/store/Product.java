package store;
//Class Product
public class Product {
	//private String set to name
	private String name;
	//private String set to description
	private String description;
	//private double set to price
	private double price;
	//private int set to id
	private int id;

	//public Product constructor pass String, String, double, int
	public Product(String name, String description, double price, int id) {
		//set object name to passed name
		this.name = name;
		//set object description to passed description 
		this.description = description;
		//set object price to passed price
		this.price = price;
		//set object id to passed id
		this.id = id;
		
	}

	//public return String getName()
	public String getName() {
		//return String
		return name;
	}

	//public return String getDescription()
	public String getDescription() {
		//return String
		return description;
	}

	//public return double getPrice()
	public double getPrice() {
		//return double
		return price;
	}

	//public return int getId()
	public int getId() {
		//return int
		return id;
	}

}
