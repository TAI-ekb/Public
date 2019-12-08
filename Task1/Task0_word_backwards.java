public class Task0_word_backwards {

    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        for (int i = 0; i < 10; i += 2) {
            System.out.print(arr[i]);
        }


        String[] yearTime = {"зима", "весна", "лето", "1", "осень"};
        for (String str : yearTime) {
            System.out.print(str);
        }
        String str1 = "Зима";
        System.out.println(str1);
        System.out.println(str1.length());
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.toCharArray()[i]);
        }
        /*for (char str2 : str1.toCharArray()) {
            System.out.println(str2);
            if (str2 == 'м') break;
        }*/
        String str3 = "123456789";
        char [] str4 = new char[str3.length()];
        String str5 = "";
        int x = 0;
                for (int i = str3.length()-1; i>-1; i--) {
                    str4[x] = str3.toCharArray()[i];
                    str5 = str5+str4[x];
                    x++;}
        System.out.println(str4);
        System.out.println(str5);


    }
    }