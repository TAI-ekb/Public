public class MainTask2_String_backwards {
	public static void main(String[] args){
	String str = "Programming is good, but there is something better";
	System.out.println(str);
	String[] str1 = str.split(" ");
	boolean check = false;
	String[] resault = new String [str1.length];
	int i = 0;
	for (String x: str1) {
		//char[] ch = x.toCharArray();
		if (check == true) {
			x = x.concat(",");
			check = false;
		}
		else if (x.indexOf(',')>0) {
			x = x.substring(0,x.indexOf(','));
			check = true;
		}
		resault[i] = x;
		i++;
		//System.out.println(ch);
				/*for (int y = 0; y < x.length()-1; y++) {
			if (ch[y]==',') {
				x.substring(0,6);
				(x+1).concat(",");
				System.out.println(x);
				System.out.println(x+1);
			}
		} */
		/*if (
	}
		//str1[x] = str.toString().split(" ")[x];
	char [] zpt = new char[str1[x].lenght()]; //поиск запятой и добавление её к следующему элементу
		for (y = 0; y>str1[x].lenght(); y++) {
		zpt[y] = str1.toCharArray()[y];
		if (zpt[y]==',') {
		str1[x].substring(0,6);
		str1[x+1].concat(",");
		System.out.println(str1[x]);
		System.out.println(str1[x+1]);
		}*/
		}
		System.out.println(str.indexOf(','));
		
	for (int z = resault.length-1; z>=0; z--) {
		System.out.print(" "+resault[z]);
	}
	}
	}
	