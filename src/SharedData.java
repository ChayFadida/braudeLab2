import java.util.ArrayList;


/** Description of SharedData: The code snippet shows a Java class called SharedData. It has four instance variables including an ArrayList of integers, an array of booleans, a boolean flag, and a final integer.
 * @author Yuval Hilay
 * @author Yehezkel-Chay Fadida
 * @version 6.0z Build 9000 March 19,2023
 */

/**  The class constructor takes an ArrayList of integers and an integer value as arguments and initializes the corresponding instance variables. The purpose of this class is likely to hold and manage shared data between multiple threads or objects.*/
public class SharedData 
{
	private ArrayList<Integer> array;
	private boolean [] winArray;
	private boolean flag;
	private final int b;
	
	/**
	 * @param array2                array2 is array of success
	 * @param b                     B is final int
	 */
	public SharedData(ArrayList<Integer> array2, int b) {
		
		this.array = array2;
		this.b = b;
	}
/** Return the array of winning*/
	/**
	 * @return the success array
	 */
	public boolean[] getWinArray() 
	{
		return winArray;
	}
	/** set this to be the winarray*/
	/**
	 * @param winArray             the array of success
	 */
	public void setWinArray(boolean [] winArray) 
	{
		this.winArray = winArray;
	}
	
	/**
	 * @return return the array
	 */
	public ArrayList<Integer> getArray() 
	{
		return array;
	}

	/**
	 * @return b
	 */
	public int getB() 
	{
		return b;
	}

	/**
	 * @return flag
	 */
	public boolean getFlag() 
	{
		return flag;
	}

	/**
	 * @param flag        the setting of the flag
	 */

	public void setFlag(boolean flag) {
		this.flag = flag;
	} 
}