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
		ArrayList<Integer> hexNums = new ArrayList<Integer>();
		BinaryDecimal bd = new BinaryDecimal();
		
		fourBitStrings = createFourBitStrings(bin);
		
		for(int i=0; i < fourBitStrings.size(); i++) {
			hexNums.add(bd.binToDec(fourBitStrings.get(i)));
		}
		
		for(int i=hexNums.size()-1; i >= 0; i--) {
			if(hexNums.get(i) <= 9) {
				hex = hex + hexNums.get(i).toString();
			} else {
				switch(hexNums.get(i)) {
				case 10:
					hex = hex + "A";
					break;
				case 11:
					hex = hex + "B";
					break;
				case 12:
					hex = hex + "C";
					break;
				case 13:
					hex = hex + "D";
					break;
				case 14:
					hex = hex + "E";
					break;
				case 15:
					hex = hex + "F";
					break;
				}
			}
		}
		if(hex.charAt(0) == '0') {
			hex = hex.substring(1);
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
