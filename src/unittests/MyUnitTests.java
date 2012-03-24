package unittests;

import org.junit.Assume;
import org.junit.Test;

import test.MyTest;

/**
 * @author Kamil Sorokosz
 *
 */
public class MyUnitTests 
{	
	/**
	 * Tested object
	 */
	private MyTest my = new MyTest();
	
	/**
	 * Tests constructor
	 */
	@Test
	public void testMyTest() 
	{
		Assume.assumeNotNull(my);
	}

	/**
	 * Tests get element from vector
	 */
	@Test
	public void testGetVectorElement() 
	{
		my.getVectorElement(0);
		my.getVectorElement(1);
		my.getVectorElement(2);
	}
	
	/**
	 * Tests exceptions
	 * @throws ArrayIndexOutOfBoundsException 
	 * 
	 */
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGetVectorElementThrowsException() throws ArrayIndexOutOfBoundsException
	{
		my.getVectorElement(3);
	}

	/**
	 * Tests get element from simple array
	 */
	@Test(expected = NullPointerException.class)
	public void testGetSimpleArrayElement() 
	{
		my.getSimpleArrayElement(0);
	}

	/**
	 * Tests get element from array list
	 */
	@Test
	public void testGetArrayListElement() 
	{
		my.getArrayListElement(0);
		my.getArrayListElement(2);
		my.getArrayListElement(1);
	}
}
