package SWE.MavenProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest extends App
{
    
    @Test
    public void shouldAnswerWithTrue()
    {
    	String[] args1 = {"2","9","30","1","20"};
    	assertEquals("30", getMaximum(args1));
    	
    	String[] args2 = {"Follow"};
    	assertEquals("wolloF", getReverse(args2));
    	
    	String[] args3 = {"2"};
    	assertEquals("8", getCube(args3));
    }
}
