
/**
 * 
 */
package test;

import java.util.ArrayList;
import java.util.Vector;


/**
 * @author Kamil Sorokosz
 *
 */
public class MyTest 
{
	
	/**
	 * Constructs an instance
	 */
	public MyTest() 
	{
		// Create vector instance
		numberVector = new Vector<Integer>();
		
		// Create array list instance
		numberArrayList = new ArrayList<Integer>();
		
		// Adds element to vector
		numberVector.add(3);
		numberVector.add(5);
		numberVector.add(4);
		
		// Adds element to array list
		numberArrayList.add(4);
		numberArrayList.add(6);
		numberArrayList.add(8);
	}
	
	/**
	 * @param index Vector index
	 * @return Vector element - integer value
	 * @throws ArrayIndexOutOfBoundsException 
	 */
	public Integer getVectorElement(Integer index) throws ArrayIndexOutOfBoundsException
	{
		return numberVector.elementAt(index);
	}

	/**
	 * @param index Simple array index
	 * @return Simple array element - integer value
	 */
	public Integer getSimpleArrayElement(Integer index)
	{
		return simpleArray[index];
	}
	
	/**
	 * @param index Array list index
	 * @return Array list element - integer value
	 */
	public Integer getArrayListElement(Integer index )
	{
		return numberArrayList.get(index);
	}
	
	private Integer[] simpleArray;
	private Vector<Integer> numberVector;
	private ArrayList<Integer> numberArrayList;
}
