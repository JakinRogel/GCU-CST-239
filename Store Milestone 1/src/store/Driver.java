package store;

/* Driver class instantiates Inventory, Cart, and Store. Then the Store functions are called to 
 * open store, purchase items adding them to the cart and subtracting them from inventory, 
 * then cancel one item removing it from the cart and adding to inventory. 
 */
//Class Driver
public class Driver {
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instantiation of Inventory set to inv
		Inventory inv = new Inventory();
		//instantiation of Cart set to cart
		Cart cart = new Cart();
		//instantiation of Store set to store
		Store store = new Store();
		
		//call openStore() from store object
		store.openStore();
		//call purchase() with 2 ints and 2 objects from store object
		store.purchase(1, 3, inv, cart);
		//call purchase() with 2 ints and 2 objects from store object
		store.purchase(2, 2, inv, cart);
		//call purchase() with 2 ints and 2 objects from store object
		store.purchase(3, 1, inv, cart);
		//call cancel() with 2 ints and 2 objects from store object
		store.cancel(2, 6, inv, cart);
		//for loop through object cart
		for (int i = 0; i < Cart.cart.size(); i++) {
		//print cart items name
		System.out.println(Cart.cart.get(i).getName() + " is in the cart!");
		}
		//print String + call cart.getTotal() pass object return double + String
		System.out.println("$" + cart.getTotal(inv) + " total");
		//print String + inventory quantity of product1 (cherries)
		System.out.println("Cherries Inventory: " + Inventory.getQuantityP1());
		//print String + inventory quantity of product2 (apples)
		System.out.println("Apples Inventory: " + Inventory.getQuantityP2());
		//print String + inventory quantity of product3 (peaches)
		System.out.println("Peaches Inventory: " + Inventory.getQuantityP3());
		//call closeStore() from store object
		store.closeStore();
	}
	
	

}
