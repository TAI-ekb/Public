package sb.tai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Вторая задача
        String inData = "If you want to start thinking at a higher level, there’s a drawback: You need to program to the " +
                "exact type of the container in order to use it. This might not seem bad at first, but what if you write " +
                "code for a List, and later on you discover that it would be convenient to apply that same code to a Set?";
        System.out.println("Входные данные второй задачи = " + inData);
        Map<Character, Integer> simvMap = new HashMap<Character, Integer>();
        for (char c : inData.toCharArray()) {
            //if (String.valueOf(c).equalsIgnoreCase(String.valueOf())
            if (simvMap.containsKey(c)) {
                simvMap.put(c, simvMap.get(c) + 1);
            } else simvMap.put(c, 1);
        }
        System.out.println("Ответ второй задачи (долго думал как использовать equalsIgnoreCase - так и не придумал)");
        System.out.println(simvMap);
        //третья задача
        Integer[] arrWithDouble = new Integer[]{1, 5, 6, 7, 1, 3, 5, 7, 10, 11, 1, 7, 11, 5, 11, 11};//создал массив для того, чтобы его передать в Коллекцию
        ArrayList<Integer> arrWithDoubleColl = new ArrayList<Integer>(Arrays.asList(arrWithDouble));
        System.out.println("Третья задача. Исходная коллекция = " + arrWithDoubleColl);
        System.out.println("Длинна исходной коллекции = " + arrWithDoubleColl.size());
        removeDouble(arrWithDoubleColl);
        //arrWithDoubleColl.remove(arrWithDoubleColl.indexOf(arrWithDoubleColl.contains())) - пробовал в одну строку :)
    }

    public static void removeDouble(ArrayList<Integer> arr) {
        int s = arr.size();
        for (int i = 0; i < s; i++) {
            while ((arr.lastIndexOf(i) - arr.indexOf(i)) >= 1) {
                arr.remove(arr.lastIndexOf(i));
            }

        }
        System.out.println("Результирующая коллекция = " + arr);
        System.out.println("Длинна результирующей коллекции = " + arr.size());
    }
}



