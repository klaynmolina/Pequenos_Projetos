package tabuada;

public class IsNumeric {
	
	public static boolean isNumeric(String x) { 
		
		try {  
			Integer.parseInt(x);  
			return true;
			} catch(NumberFormatException e){  
			    return false;  
			  }
		
		}
}

