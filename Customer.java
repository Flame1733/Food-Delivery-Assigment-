import java.util.ArrayList;
/**
* Customer class
*/
public class Customer {
	private String Customername;
	private ArrayList<food>cart;
	private ArrayList<order>orders;
	private int count;

	
	/**
	 * Constructor of Customer class
	 * @param Customername Customer's name
	 */
	public Customer(String Customername){
		this.Customername=Customername;
		this.cart=new ArrayList<food>();
		this.orders=new ArrayList<order>();
		this.count=0;
	}
	
	
	/**
	* Gets the cart
	* @return Arraylist containing the food for cart
	*/
	public ArrayList<food> getCart() {
		return cart;
	}

	/**
	 * Gets customer name
	 * @return A string representing Customer name
	 */
	public String getCustomerName() {
		return Customername;
	}
	/**
	 * Gets list of orders
	 * @return Arraylist containing the orders
	 */
	public ArrayList<order> getOrders() {
		return orders;
	}

	/**
	 * Gets count
	 * @return An int value representing count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Sets count
	 * @param count An int count value
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
