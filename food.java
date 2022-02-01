/**
* Food class
*/
public class food {
	private String name;
	private int code;
	private double price;

	/**
	 * Constructor of food class
	 * @param name The food name
	 * @param code The food code
	 * @param price The food price
	 */
	public food(String name, int code,double price){
		this.name=name;
		this.code=code;
		this.price=price;
	}

	/**
	 * Gets name of food
	 * @return A string representing food name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets name of food
	 * @param name A string containing the food name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets code of food
	 * @return An int representing food code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * Sets the food code
	 * @param code An int value containing the food code
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * Gets price of food
	 * @return A double representing food price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the food price
	 * @param price A double value containing the food price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Displays the code, name, and price from food
	 * @return code, name, price
	 *{@summary} method to print food class objects
	 */
	public String toString() {
		return  " " + code + "\t\t" + name + "\t\t" + price+ " RM\n";
	}
}