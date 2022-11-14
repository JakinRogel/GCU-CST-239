package store;
//Class Store
public class Store {
	//declare boolean set to storeOpen set to false
	boolean storeOpen = false;
	//public return void purchase() pass int, int, object, object
	public void purchase(int productNum, int quantity, Inventory inv, Cart cart) {
		//if statement pass call inv.checkInv() pass int and check storeOpen is true then...
		if(inv.checkInv(productNum) && storeOpen) {
			//if statement pass int quantity check is less than or equal to pass call inv.getQuantity() pass productNum if true then...
			if (quantity <= inv.getQuantity(productNum)) {
				//switch pass int
				switch(productNum) {
				//case 1
				case 1:
					//for loop for quantity value 
					for(int i = 0; i < quantity; i++) {
						//call cart.addProduct() pass call cart.add() pass i and object
						cart.addProduct(cart.add(i, inv));
						//call inv.removeInv() pass int
						inv.removeInv(productNum);
					}
					//break
					break;
				//case 2
				case 2:
					//for loop for quantity value
					for(int i = 0; i < quantity; i++) {
						//call cart.addProduct() pass call cart.add() pass i+5 and object
						cart.addProduct(cart.add(i+5, inv));
						//call inv.removeInv() pass int
						inv.removeInv(productNum);
					}
					//break
					break;
				//case 3
				case 3:
					//for loop for quantity value
					for(int i = 0; i < quantity; i++) {
						//call cart.addProduct() pass call cart.add() pass i+10 and object
						cart.addProduct(cart.add(i+10, inv));
						//call inv.removeInv() pass int
						inv.removeInv(productNum);
					}
					//break
					break;
				}
			  //otherwise print String
			} else System.out.println("does not compute");
		  //otherwise print String
		} else System.out.println("does not compute");
	}
	//public return void cancel() pass int, int, object, object
	public void cancel(int productNum, int id, Inventory inv, Cart cart) {
		//if statement pass call cart.getItems() check if is not equal to 0
		if(!(cart.getItems()==0)) {
			//call cart.remove() pass int, int, object
			cart.remove(productNum, id, inv);
		  //otherwise print String
		} else System.out.println("There is nothing in the cart");
	}
	//public return void openStore()
	public void openStore() {
		//if statement check if not storeOpen is true then...
		if(!storeOpen) {
			//storeOpen equals true
			storeOpen = true;
			//print String
			System.out.println("The Store is open!");
		  //otherwise print String
		} else System.out.println("The Store is already open!");
	}
	//public return void closeStore()
	public void closeStore() {
		//if statement check if storeOpen is true then...
		if(storeOpen) {
			//storeOpen equals false
			storeOpen = false;
			//print String
			System.out.println("The Store is closed!");
		  //otherwise print String
		} else System.out.println("The Store is already closed!");
	}
}
