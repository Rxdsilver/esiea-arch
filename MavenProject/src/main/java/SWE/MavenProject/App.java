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
    
    public String getMaximum(String[] array) {
    	Integer ret = Integer.parseInt(array[0]);
    	
        for (int i = 0; i< array.length ;i++) {
     	   if (Integer.parseInt(array[i])>ret) {
     		   ret = Integer.parseInt(array[i]);
     	   }
        }     
        return ret.toString();
    }
    
    public String getCube(String[] array) {
    	Integer temp = Integer.parseInt(array[0]);
    	temp = temp*temp*temp;
    	return String.valueOf(temp);
    }
}
