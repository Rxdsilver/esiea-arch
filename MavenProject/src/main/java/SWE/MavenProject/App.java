package SWE.MavenProject;

public class App 
{
	
    public static void main( String[] args ){	
    	
 
    }
    
    public String getReverse(String[] array) {
	    char[] ch = array[0].toCharArray();
	    	  
	    for(int i=0; i<(ch.length)/2;i++) {
	       char temp = ch[ch.length-i-1];
	       ch[ch.length-i-1] = ch[i];
	       ch[i] = temp;
	    }
	        
	    return String.valueOf(ch);
    }
    
    public int getMaximum(Integer[] array) {
    	Integer ret = array[0];
    	
        for (int i = 1; i< array.length ;i++) {
     	   if (array[i]>ret) {
     		   ret = array[i];
     	   }
        }     
        return ret;
    }
    
    public int getCube(Integer integer) {
    	Integer temp = integer;
    	temp = temp*temp*temp;
    	return temp;
    }
}
