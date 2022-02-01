import java.util.ArrayList;
/**
* Restaurant class
*/
public class Restaurant {
	private ArrayList<food>menu;
	private int count;
	
	/**
	 * Constructor of Restaurant class
	 */
	public Restaurant (){
		this.menu = new ArrayList<food>();
		this.count=0;
	 }
	 
	/**
	 * Gets menu list of food
	 * @return An arraylist containing menu
	 */
	public ArrayList<food> getMenu() {
		return menu;
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