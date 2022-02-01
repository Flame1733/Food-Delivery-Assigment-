import java.util.Date;
/**
* Order class
*/
public class order extends Customer{
	private String orderstatus;
	private Date orderhistory;
	private String ordername;
	private String signature;
	
	/**
	 * Constructor of order class
	 * @param ordername Order's name
	 * @param Customername Customer's name
	 */
	public order(String ordername,String Customername) {
		super(Customername);
		this.ordername=ordername;
	}
	/**
	 * Gets order status
	 * @return A string representing order status
	 */
	public String getOrderstatus() {
		return orderstatus;
	}
	/**
	 * Sets order status
	 * @param orderstatus A string containing order status
	 */
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	/**
	 * Gets history of orders
	 * @return A date that is the time the order took place
	 */
	public Date getOrderhistory() {
		return orderhistory;
	}
	/**
	 * Sets history of orders
	 * @param orderhistory A date type containing the time the order took place
	 */
	public void setOrderhistory(Date orderhistory) {
		this.orderhistory = orderhistory;
	}
	/**
	 * Gets order name
	 * @return A string representing order name
	 */
	public String getName() {
		return ordername;
	}
	/**
	 * Gets restaurant's signature
	 * @return A string representing restaurant's signature
	 */
	public String getSignature() {
		return signature;
	}
	/**
	 * Sets signature
	 * @param signature A string containing restaurant's signature
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}
}
