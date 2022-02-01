import java.util.LinkedList;
import java.util.Queue;
/**
* Admin class
*/
public class Admin {
	private Queue<Rider>riders;

	/**
     * Constructor of Admin class
	 */
	public Admin() {
		this.riders=new LinkedList<Rider>();
	}

	/**
	 * Gets queue of riders
	 * @return A string that represents the queue of elements which is the riders. The first of the elements in the queue will be displayed first and ready.
	 */
	public Queue<Rider> getRiders() {
		return riders;
	}
}
