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
	
//	***** NOT PROPERLY IMPLEMENTED *****
//	public String decToBin(int dec) {
//		int i = 0, b = 0, temp = 0;
//		String s = "";
//		
//		while (i <= 7) {
//			b = dec % 2;
//			s = b + s;
//			temp = dec /2;
//			dec = temp;
//			i++;
//		}
//		return s;
	}