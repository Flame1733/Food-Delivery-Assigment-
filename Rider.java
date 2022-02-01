import java.util.ArrayList;
/**
* Rider class
*/
public class Rider {
	private String name;
	private String status;
	private ArrayList<order>riderorders;
	private int count;

	/**
     * Constructor of Rider class	 
	 * @param name Rider's name
	 */
	public Rider(String name) {
		this.name=name;
		this.riderorders=new ArrayList<order>();
		this.count=0;
	}

	/**
	 * Gets name of rider
	 * @return A string representing rider's name

	 */
	public String getName() {
		return name;
	}

	/**
	 * Gets status
	 * @return A string representing status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * Sets status
	 * @param status A string of the status
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * Gets list of riders orders
	 * @return An arraylist containing riderorders
	 */
	public ArrayList<order> getRiderorders() {
		return riderorders;
	}
	/**
	 * Method for printing Rider class objects
	 */
	public String toString() {
		return name +" : "+ status ;
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
	 * @param count An int value for count
	 */
	public void setCount(int count) {
		this.count = count;
	}
}
