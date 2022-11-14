package store;

import java.util.ArrayList;
//Class Inventory
public class Inventory {
	//private static int set to quantityP1
	private static int quantityP1;
	//private static int set to quantityP2
	private static int quantityP2;
	//private static int set to quantityP3
	private static int quantityP3;
	//declare ArrayList of Product set to product1
	private ArrayList<Product> product1;
	//declare ArrayList of Product set to product2
	private ArrayList<Product> product2;
	//declare ArrayList of Product set to product3
	private ArrayList<Product> product3;
	//declare Product object set to cherry1
	private Product cherry1;
	//declare Product object set to cherry2
	private Product cherry2;
	//declare Product object set to cherry3
	private Product cherry3;
	//declare Product object set to cherry4
	private Product cherry4;
	//declare Product object set to cherry5
	private Product cherry5;
	//declare Product object set to apple1
	private Product apple1;
	//declare Product object set to apple1
	private Product apple2;
	//declare Product object set to apple1
	private Product apple3;
	//declare Product object set to apple1
	private Product apple4;
	//declare Product object set to apple1
	private Product apple5;
	//declare Product object set to peach1
	private Product peach1;
	//declare Product object set to peach2
	private Product peach2;
	//declare Product object set to peach3
	private Product peach3;
	//declare Product object set to peach4
	private Product peach4;
	//declare Product object set to peach5
	private Product peach5;
	//public Inventory constructor 
	public Inventory() {
		//instantiate object product1 from Arraylist of Product
		product1 = new ArrayList<Product>();
		//instantiate object product2 from Arraylist of Product
		product2 = new ArrayList<Product>();
		//instantiate object product3 from Arraylist of Product
		product3 = new ArrayList<Product>();
		//instantiate object cherry1 from Product object
		cherry1 = new Product("Cherry1", "A red fruit", 5.00, 1);
		//add object to arraylist
		product1.add(cherry1);
		//increment quantity for object
		addQuantityP1();
		//instantiate object cherry2 from Product object
		cherry2 = new Product("Cherry2", "A red fruit", 5.00, 2);
		//add object to arraylist
		product1.add(cherry2);
		//increment quantity for object
		addQuantityP1();
		//instantiate object cherry3 from Product object
		cherry3 = new Product("Cherry3", "A red fruit", 5.00, 3);
		//add object to arraylist
		product1.add(cherry3);
		//increment quantity for object
		addQuantityP1();
		//instantiate object cherry4 from Product object
		cherry4 = new Product("Cherry4", "A red fruit", 5.00, 4);
		//add object to arraylist
		product1.add(cherry4);
		//increment quantity for object
		addQuantityP1();
		//instantiate object cherry5 from Product object
		cherry5 = new Product("Cherry5", "A red fruit", 5.00, 5);
		//add object to arraylist
		product1.add(cherry5);
		//increment quantity for object
		addQuantityP1();
		//instantiate object apple1 from Product object
		apple1 = new Product("Apple1", "A green fruit", 6.50, 6);
		//add object to arraylist
		product2.add(apple1);
		//increment quantity for object
		addQuantityP2();
		//instantiate object apple2 from Product object
		apple2 = new Product("Apple2", "A green fruit", 6.50, 7);
		//add object to arraylist
		product2.add(apple2);
		//increment quantity for object
		 addQuantityP2();
		//instantiate object apple3 from Product object
		apple3 = new Product("Apple3", "A green fruit", 6.50, 8);
		//add object to arraylist
		product2.add(apple3);
		//increment quantity for object
		 addQuantityP2();
		//instantiate object apple4 from Product object
		apple4 = new Product("Apple4", "A green fruit", 6.50, 9);
		//add object to arraylist
		product2.add(apple4);
		//increment quantity for object
		 addQuantityP2();
		//instantiate object apple5 from Product object
		apple5 = new Product("Apple5", "A green fruit", 6.50, 10);
		//add object to arraylist
		product2.add(apple5);
		//increment quantity for object
		 addQuantityP2();
		//instantiate object peach1 from Product object
		peach1 = new Product("Peach1", "A fuzzy fruit", 5.50, 11);
		//add object to arraylist
		product3.add(peach1);
		//increment quantity for object
		addQuantityP3();
		//instantiate object peach2 from Product object
		peach2 = new Product("Peach2", "A fuzzy fruit", 5.50, 12);
		//add object to arraylist
		product3.add(peach2);
		//increment quantity for object
		addQuantityP3();
		//instantiate object peach3 from Product object
		peach3 = new Product("Peach3", "A fuzzy fruit", 5.50, 13);
		//add object to arraylist
		product3.add(peach3);
		//increment quantity for object
		addQuantityP3();
		//instantiate object peach4 from Product object
		peach4 = new Product("Peach4", "A fuzzy fruit", 5.50, 14);
		//add object to arraylist
		product3.add(peach4);
		//increment quantity for object
		addQuantityP3();
		//instantiate object peach5 from Product object
		peach5 = new Product("Peach5", "A fuzzy fruit", 5.50, 15);
		//add object to arraylist
		product3.add(peach5);
		//increment quantity for object
		addQuantityP3();
	}
	//public return boolean checkInv() pass int
	public boolean checkInv(int productNum) {
		//switch pass productNum
		switch(productNum) {
		//case 1
		case 1:
			//if statement call getQuantity() pass int if greater than zero then...
			if(getQuantity(productNum) > 0) {
				//return true
				return true;
			} //otherwise return false
			else return false;
		//case 2
		case 2:
			//if statement call getQuantity() pass int if greater than zero then...
			if(getQuantity(productNum) > 0) {
				//return true
				return true;
			} //otherwise return false
			else return false;
		//case 3
		case 3:
			//if statement call getQuantity() pass int if greater than zero then...
			if(getQuantity(productNum) > 0) {
				//return true
				return true;
			} //otherwise return false
			else return false;
		//default
		default:
			//print String
			System.out.println("Wrong product number");
			//return false
			return false;
		}
		
	}
	//public return void subQuantity() pass int
	public void subQuantity(int productNum) {
		//switch pass int
		switch(productNum) {
		//case 1
		case 1: 
			//call subQuantityP1() 
			subQuantityP1();
			//break
			break;
		//case 2
		case 2:
			//call subQuantityP2()
			subQuantityP2();
			//break
			break;
		//case 3
		case 3:
			//call subQuantityP3()
			subQuantityP3();
			//break
			break;
		//default
		default:
			//print String
			System.out.println("Wrong product number");
			//break
			break;
		}
	}
	//public return void addQuantity() pass int
	public void addQuantity(int productNum) {
		//switch pass int
		switch(productNum) {
		//case 1
		case 1: 
			//call addQuantityP1()
			addQuantityP1();
			//break
			break;
		//case 2
		case 2:
			//call addQuantityP2()
			addQuantityP2();
			//break
			break;
		//case 3
		case 3:
			//call addQuantityP3()
			addQuantityP3();
			//break
			break;
		//default
		default:
			//print String
			System.out.println("Wrong product number");
			//break
			break;
		}
	}
	//public return void removeInv() pass int
	public void removeInv(int productNum) {
		//switch pass int
		switch(productNum) {
		//case 1
		case 1: 
			//call product1.remove() pass 0 
			product1.remove(0);
			//call subQuantityP1()
			subQuantityP1();
			//break
			break;
		//case 2
		case 2:
			//call product2.remove() pass zero
			product2.remove(0);
			//call subQuantityP2()
			subQuantityP2();
			//break
			break;
		//case 3
		case 3:
			//call product3.remove() pass zero
			product3.remove(0);
			//call subQuantityP3()
			subQuantityP3();
			//break
			break;
		//default
		default:
			//print String
			System.out.println("Wrong product number");
			//break
			break;
		}
	}
	//public return void addInv() pass int, int
	public void addInv(int productNum, int id) {
		//switch pass int
		switch(productNum) {
		//case 1
		case 1: 
			//call product1.add() pass call getId() pass id
			product1.add(getId(id));
			//call addQuantityP1()
			addQuantityP1();
			//break
			break;
		//case 2
		case 2:
			//call product2.add() pass call getId() pass id
			product2.add(getId(id));
			//call addQuantityP2
			addQuantityP2();
			//break
			break;
		//case 3
		case 3:
			//call product3.add() pass call getId() pass id 
			product3.add(getId(id));
			//call addQuantityP3()
			addQuantityP3();
			//break
			break;
		//default
		default:
			//print String
			System.out.println("Wrong product number");
			//break
			break;
		}
	}

	//Product getId() pass int
	Product getId(int id) {
		//switch pass id
		switch(id) {
		//case 1
		case 1:
			//return object
			return cherry1;
		//case 2
		case 2:
			//return object
			return cherry2;
		//case 3
		case 3:
			//return object
			return cherry3;
		//case 4
		case 4:
			//return object
			return cherry4;
		//case 5
		case 5:
			//return object
			return cherry5;
		//case 6
		case 6:
			//return object
			return apple1;
		//case 7
		case 7:
			//return object
			return apple2;
		//case 8
		case 8:
			//return object
			return apple3;
		//case 9
		case 9:
			//return object
			return apple4;
		//case 10
		case 10:
			//return object
			return apple5;
		//case 11
		case 11:
			//return object
			return peach1;
		//case 12
		case 12:
			//return object
			return peach2;
		//case 13
		case 13:
			//return object
			return peach3;
		//case 14
		case 14:
			//return object
			return peach4;
		//case 15
		case 15:
			//return object
			return peach5;
		//default
		default:
			//return null
			return null;
		}
	}
	//public return int getQuantity() pass int
	public int getQuantity(int productNum) {
		//switch pass int
		switch(productNum) {
		//case 1
		case 1:
			// return call getQuantityP1()
			return getQuantityP1();
		//case 2
		case 2:
			//return call getQuantityP2()
			return getQuantityP2();
		//case 3
		case 3:
			//return call getQuantityP3()
			return getQuantityP3();
		//default
		default:
			//print String
			System.out.println("Wrong product number");
			//return -1
			return -1;
		}
	}
	//public static return int getQuantityP1()
	public static int getQuantityP1() {
		//return int
		return quantityP1;
	}
	//public return void addQuantity()
	public void addQuantityP1() {
		//return int
		quantityP1++;
	}
	//public return void subQuantityP1()
	public void subQuantityP1() {
		//return int
		--quantityP1;
	}
	//public static return int getQuantityP2()
	public static int getQuantityP2() {
		//return int
		return quantityP2;
	}
	//public return void addQuantityP2()
	public void addQuantityP2() {
		//return int
		quantityP2++;
	}
	//public return void subQuantityP2()
	public void subQuantityP2() {
		//return int
		--quantityP2;
	}
	//public static return int getQuantityP3()
	public static int getQuantityP3() {
		//return int
		return quantityP3;
	}
	//public return void addQuantityP3()
	public void addQuantityP3() {
		//return int
		quantityP3++;
	}
	//public return void subQuantityP3()
	public void subQuantityP3() {
		//return int
		--quantityP3;
	}
	

	
}
