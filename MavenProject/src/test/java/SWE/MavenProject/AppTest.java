package SWE.MavenProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App
{
    
    @Test
    public void testMaximum()
    {
    	Integer[] args1 = {2,9,30,1,20};
    	assertEquals(30, getMaximum(args1));
    	
    }
    
    @Test
    public void testReverse() {
    	String[] args2 = {"Follow"};
    	assertEquals("wolloF", getReverse(args2));
    }
    
    @Test
    public void testCube() {
    	Integer args3 = 2;
    	assertEquals(8, getCube(args3));
    }
}
