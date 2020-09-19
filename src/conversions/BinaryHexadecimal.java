package conversions;

import java.awt.List;
import java.util.ArrayList;

public class BinaryHexadecimal {
	
	public String binToHex(String bin) {
		String hex = "";
		
		// Divide binary string into blocks of 4 bits each
		
		// Convert each 4 bit binary string to dec value (already done)
		
		// Convert the dec value to hex value
		
		// Concatenate the string to create the hex value
		
		
		return hex;
	}
	
	/************************************************************************************************************
	 * 
	 * getParts() from java2s.com  | © Demo Source and Support
	 * http://www.java2s.com/Tutorials/Java/Algorithms_How_to/String/Split_a_string_at_every_n_th_character.htm
	 *
	 ***********************************************************************************************************/
	
	public ArrayList<String> getParts(String string, int partitionSize) {
	    ArrayList<String> parts = new ArrayList<String>();
	    int len = string.length();
	    for (int i = 0; i < len; i += partitionSize) {
	      parts.add(string.substring(i, Math.min(len, i + partitionSize)));
	    }
	    return parts;
	  }
	
}
