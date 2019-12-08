public class MainTask3_Couting_Char_in_String {
	public static void main(String[] args){
	//public static void coutingCharsInString (String str, char c) {
		String str = "Programmingm";
	//String str2 = "ищем символ m в строке: ";
	//System.out.println(str);
		char c = 'm';
		System.out.println("ищем символ "+ String.valueOf(c) + " в строке: " + str);
		int ind = str.indexOf(c);
		char[] ch = str.toCharArray();
		int sumCh = 0;
		StringBuffer position = new StringBuffer("");
		for (int i = 0; i<ch.length; i++) {
			if (ch[i] == c) {
			sumCh = sumCh+1;
			position.append(String.valueOf(i) + " позиция в строке");
			}
		}
		System.out.println("Колличество повторений символа " + c + " в строке = " +sumCh);
		System.out.println("Позиция в строке = " + position.toString());
		
		/*if (sumCh>=2) {
			int ind2 = str.substring(ind+1).indexOf(c);
			System.out.println("2-я позиция в строке = " + (ind+1+ind2+1));
		}*/
	
		}
	}

	