package sb.tai;

import static java.lang.Double.*;

public class CarsUtils {
    public static Integer copyFinder(Car[] mass, String t, String n) {
        for (int z = 0; z < mass.length; z++) {
            if (mass[z] == null)
                return -1;
            if (mass[z].getTypeCar().equals(t) && mass[z].getGosNum().equals(n)) {
                System.out.println("Найдено совпадение с элементом №" + z);
                return z;
            }
        }
        return -1;
    }

    public static Double rashALL(Car[] rA, int i) {
        Double rashAll = 0d;
        for (int r = 0; r < i - 1; r++) {
            rashAll = rashAll + rA[r].getPetrCon();
        }
        return rashAll;
    }
    public static Double rashC100(Car[] rA, int i) {
        Double rashC100 = 0d;
        for (int r = 0; r < i - 1; r++) {
            if (rA[r].getTypeCar().equals("C100")) {
                rashC100 = rashC100 + rA[r].getPetrCon();
            }
        }
        return  rashC100;
    }
    public static Double rashC200(Car[] rA, int i) {
        Double rashC200 = 0d;
        for (int r = 0; r < i - 1; r++) {
            if (rA[r].getTypeCar().equals("C200")) {
                rashC200 = rashC200 + rA[r].getPetrCon();
            }
            }
        return rashC200;
    }
    public static Double rashC300(Car[] rA, int i) {
        Double rashC300 = 0d;
        for (int r = 0; r < i - 1; r++) {
            if (rA[r].getTypeCar().equals("C300")) {
                rashC300 = rashC300 + rA[r].getPetrCon();
            }
        }
        return rashC300;
    }
    public static Double rashC400(Car[] rA, int i) {
        Double rashC400 = 0d;
        for (int r = 0; r < i - 1; r++) {
            if (rA[r].getTypeCar().equals("C400")) {
                rashC400 = rashC400 + rA[r].getPetrCon();
            }
        }
        return rashC400;
    }
    public static void maxRash(Car[] mR, int i) {
        Double [] max = new Double[] {rashC100(mR,i), rashC200(mR,i), rashC300(mR,i), rashC400(mR,i)};
        for (int m = 0; m < max.length-1; m++) {
            double temp = 0d;
            if (max[m] > max[m + 1]){
                temp = max[m+1];
                max[m+1] = max[m];
                max[m] = temp;
            }
        }
        if (max[max.length-1].equals(rashC100(mR,i))) {
            System.out.println("Максимальный расход у группы C100 и он составляет = " + max[max.length - 1]);
        }
        else if (max[max.length-1].equals(rashC200(mR,i))) {
            System.out.println("Максимальный расход у группы C200 и он составляет = " + max[max.length - 1]);
        }
        else if (max[max.length-1].equals(rashC300(mR,i))) {
            System.out.println("Максимальный расход у группы C300 и он составляет = " + max[max.length - 1]);
        }
        else if (max[max.length-1].equals(rashC400(mR,i))) {
            System.out.println("Максимальный расход у группы C400 и он составляет = " + max[max.length - 1]);
        }

    }
    public static void minRash(Car[] mR, int i) {
        Double [] min = new Double[] {rashC100(mR,i), rashC200(mR,i), rashC300(mR,i), rashC400(mR,i)};
        for (int m = 0; m < min.length-1; m++) {
            double temp = 0d;
            if (min[m] < min[m + 1]){
                temp = min[m+1];
                min[m+1] = min[m];
                min[m] = temp;
            }
        }
        if (min[min.length-1].equals(rashC100(mR,i))) {
            System.out.println("Минимальный расход у группы C100 и он составляет = " + min[min.length - 1]);
        }
         else if (min[min.length-1].equals(rashC200(mR,i))) {
            System.out.println("Минимальный расход у группы C200 и он составляет = " + min[min.length - 1]);
        }
         else if (min[min.length-1].equals(rashC300(mR,i))) {
            System.out.println("Минимальный расход у группы C300 и он составляет = " + min[min.length - 1]);
        }
         else if (min[min.length-1].equals(rashC400(mR,i))) {
            System.out.println("Минимальный расход у группы C400 и он составляет = " + min[min.length - 1]);
        }
    }
    public static void sortProbegC100(Car[] sP, int i) {
        Car [] carsC100 = new Car[3];
        Car [] carsC100tmp = new Car[3];
        for (int p = 0; p < i; p++) {
             if (sP[p].getTypeCar().equals("C100")){
                 carsC100[p] = sP[p];

                 for (int n = 2; n > -1; n--) {
                    for (int j = 0; j < n ; j++) {
                        if (carsC100[j].getDist()>carsC100[j+1].getDist()) {
                            carsC100tmp[j] =
                        }
                    }
                }
                if (sP[]System.out.println("Тип Авто=" + sP[p].getTypeCar()+ "-Гос номер=" + sP[p].getGosNum() + "-Пробег="
                        + sP[p].getDist());
                //for (int n = 0; n < ; n++) {

                }
            }
        }
    }