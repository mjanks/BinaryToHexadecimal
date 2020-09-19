/*
 * This program performs binary to hexadecimal conversions
 * Created by Michael Janks
 * September 19, 2020
 */

package conversions;

public class BinaryDecimal {
	
	public int binToDec(String s) {
		int total = 0;
	
		for(int i=0; i < s.length(); i++) {
			if(s.charAt(i) == '1') {
				int y = (int) (Math.pow(2, s.length()-1-i));
				total = y + total;
			}
		}
		return total;
	}
}
