/*
 * This program performs binary to hexadecimal conversions
 * Created by Michael Janks
 * September 19, 2020
 */

package conversions;

import java.util.ArrayList;

public class BinaryHexadecimal {
	
	public String binToHex(String bin) {
		String hex = "";
		ArrayList<String> fourBitStrings = new ArrayList<String>();
		BinaryDecimal bd = new BinaryDecimal();
		
		fourBitStrings = createFourBitStrings(bin);
		
		System.out.println("size: " + fourBitStrings.size());
		for(int i=0; i < fourBitStrings.size(); i++) {
			System.out.println(fourBitStrings.get(i));
		}
		
		return hex;
	}
	
	public ArrayList<String> createFourBitStrings(String bin) {
		ArrayList<String> strs = new ArrayList<String>();
		int index = bin.length();
		
		while(index >= 0) {
			if(index-4 < 0) {
				strs.add(bin.substring(0, index));
				index = -1;
			} else {
				strs.add(bin.substring(index -4, index));
				index -= 4;
			}
		}
		return strs;
	}
	
	
	
	
	
	
	
}
