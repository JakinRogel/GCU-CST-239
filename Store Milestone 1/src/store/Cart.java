package store;

import java.util.ArrayList;
//Class Cart
public class Cart {
	//private double set to total
	private double total;
	//private int set to items
	private int items;
	//instatiate Arraylist of Product objects set to cart
	static ArrayList<Product> cart = new ArrayList<Product>();
	//public return void add() params int, int, Object
	public void add(int productNum, int id, Inventory inv) {
		//if statement call inv.checkInv() pass productNum is true then...
		if (inv.checkInv(productNum)) {
			//call cart.add() pass inv.getId() pass id 
			cart.add(inv.getId(id));
			//call inv.removeInv() pass productNum
			inv.removeInv(productNum);
		} 
		//print String + productNum + String
		else System.out.println("Not enough product" + productNum + " in inventory");
	}
	
	//public return void remove() pass int, int, object
	public void remove(int productNum, int id, Inventory inv) {
		//call cart.remove() pass inv.getId() pass id
		cart.remove(inv.getId(id));
		//call inv.addInv() pass productNum and id
		inv.addInv(productNum, id);
	}
	//public double getTotal() pass object
	public double getTotal(Inventory inv) {
		//for loop through cart.size()
		for(int i = 0; i < cart.size(); i++) {
			//double total += call cart.get(i).getPrice() return price
			total += cart.get(i).getPrice();
		}
		//return the double total
		return total;
	}

	//public return object add() pass int, object
	public Product add(int i, Inventory inv) {
		//switch statement pass i
		switch(i + 1) {
		//case 1
		case 1:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 1 return object
			return inv.getId(1);
		//case 2
		case 2:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 2 return object
			return inv.getId(2);
		//case 3
		case 3:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 3 return object
			return inv.getId(3);
		//case 4
		case 4:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 4 return object
			return inv.getId(4);
		//case 5
		case 5:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 5 return object
			return inv.getId(5);
		//case 6
		case 6:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 6 return object
			return inv.getId(6);
		//case 7
		case 7:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 7 return object
			return inv.getId(7);
		//case 8
		case 8:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 8 return object
			return inv.getId(8);
		//case 9
		case 9:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 9 return object
			return inv.getId(9);
		//case 10
		case 10:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 10 return object
			return inv.getId(10);
		//case 11
		case 11:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 11 return object
			return inv.getId(11);
		//case 12
		case 12:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 12 return object
			return inv.getId(12);
		//case 13
		case 13:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 13 return object
			return inv.getId(13);
		//case 14
		case 14:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 14 return object
			return inv.getId(14);
		//case 15
		case 15:
			//call setItems() pass call getItems() + 1
			setItems(getItems() + 1);
			//call inv.getId() pass 15 return object
			return inv.getId(15);
		//default
		default:
			//return null
			return null;
		}
	}

	//public return void add() pass object
	public void addProduct(Product object) {
		//call cart.add() pass object
		cart.add(object);
	}

	//public return int getItems()
	public int getItems() {
		//return int items
		return items;
	}

	//public return void setItems() pass int
	public void setItems(int items) {
		//set object items to passed int
		this.items = items;
	}

}
