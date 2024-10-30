package test;


public class B {
	
		   public static void main(String[] args) {
		        long number = 123456789;
		        StringBuilder formatted = new StringBuilder(String.valueOf(number));

		        // Insert commas based on the desired format
		        if (formatted.length() > 5) {
		            formatted.insert(formatted.length() - 3, ',');
		            formatted.insert(formatted.length() - 6, ',');
		            if (formatted.length() > 8) {
		                formatted.insert(formatted.length() - 9, ',');
		            }
		        }

		        System.out.println(formatted.toString());
		    }
		 
	    

}
