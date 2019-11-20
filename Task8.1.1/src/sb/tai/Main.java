package sb.tai;

public class Main {

    public static void main(String[] args) {
        String[] inData = {"C100_1-100", "C200_1-120-1200", "C300_1-120-30", "C400_1-80-20", "C100_2-50",
                "C200_2-40-1000", "C300_2-200-45", "C400_2-10-20", "C100_3-10", "C200_3-170-1100", "C300_3-150-29",
                "C400_3-100-28", "C100_1-300", "C200_1-100-750", "C300_1-32-15"};
        Car[] cars = new Car[inData.length];
        Integer i = 0;
        for (String x: inData) {
           
            String[] dist = x.split("_");

            switch (dist[0]) {
                case "C100":
                        Car Car100 = new Car ();


        /*double petC100 = 46.10; //тип топлива
        double petC300 = 47.50;
        double petC200C400 = 48.90;
        double conC100 = 12.5; //расход топлива
        double conC200 = 12;
        double conC300 = 11.5;
        double conC400 = 20;
        double distC100All = 0;
        double distC200All = 0;
        double distC300All = 0;
        double distC400All = 0;
        double distC1001 = 0; //дистанция каждого авто по номеру
        double distC1002 = 0;
        double distC1003 = 0;
        double distC2001 = 0;
        double distC2002 = 0;
        double distC2003 = 0;
        double distC3001 = 0;
        double distC3002 = 0;
        double distC3003 = 0;
        double distC4001 = 0;
        double distC4002 = 0;
        double distC4003 = 0;
        int legAll = 0; //общий объём груза
        int leg1 = 0; //объем груза каждого авто
        int leg2 = 0;
        int leg3 = 0;
        int pasAll = 0; //общее колличество пассажиров
        int pas1 = 0; //колличество пассажиров каждого авто
        int pas2 = 0;
        int pas3 = 0;
        int masAll = 0; //общая масса грузов
        int mas1 = 0; //масса грузов каждого крана
        int mas2 = 0;
        int mas3 = 0;
        for (String x: inData) {
            String[] dist = x.split("_");
            switch (dist[0]) {
                case "C100":
                    String[] dist1 = dist[1].split("-");
                    distC100All = distC100All + Integer.valueOf(dist1[1]);
                    switch (dist1[0]) {
                        case "1":
                            distC1001 = distC1001 + Integer.valueOf(dist1[1]);
                            break;
                        case "2":
                            distC1002 = distC1002 + Integer.valueOf(dist1[1]);
                            break;
                        case "3":
                            distC1003 = distC1003 + Integer.valueOf(dist1[1]);
                            break;
                    }
                break;
                case "C200":
                    String[] dist2 = dist[1].split("-");
                    distC200All = distC200All + Integer.valueOf(dist2[1]);
                    legAll = legAll + Integer.valueOf(dist2[2]);
                    switch (dist2[0]) {
                        case "1":
                            distC2001 = distC2001 + Integer.valueOf(dist2[1]);
                            leg1 = leg1 + Integer.valueOf(dist2[2]);
                            break;
                        case "2":
                            distC2002 = distC2002 + Integer.valueOf(dist2[1]);
                            leg2 = leg2 + Integer.valueOf(dist2[2]);
                            break;
                        case "3":
                            distC2003 = distC2003 + Integer.valueOf(dist2[1]);
                            leg3 = leg3 + Integer.valueOf(dist2[2]);
                            break;
                    }
                    break;
                case "C300":
                    String[] dist3 = dist[1].split("-");
                    distC300All = distC300All + Integer.valueOf(dist3[1]);
                    pasAll = pasAll + Integer.valueOf(dist3[2]);
                    switch (dist[0]) {
                        case "1":
                            distC3001 = distC3001 + Integer.valueOf(dist3[1]);
                            pas1 = pas1 + Integer.valueOf(dist3[2]);
                            break;
                        case "2":
                            distC3002 = distC3002 + Integer.valueOf(dist3[1]);
                            pas2 = pas2 + Integer.valueOf(dist3[2]);
                            break;
                        case "3":
                            distC3003 = distC3003 + Integer.valueOf(dist3[1]);
                            pas3 = pas3 + Integer.valueOf(dist3[2]);
                            break;
                    }
                break;
                case "C400":
                    String[] dist4 = dist[1].split("-");
                    distC400All = distC400All + Integer.valueOf(dist4[1]);
                    masAll = masAll + Integer.valueOf(dist4[2]);
                    switch (dist[0]) {
                        case "1":
                            distC4001 = distC4001 + Integer.valueOf(dist4[1]);
                            mas1 = mas1 + Integer.valueOf(dist4[2]);
                            break;
                        case "2":
                            distC4002 = distC4002 + Integer.valueOf(dist4[1]);
                            mas2 = mas2 + Integer.valueOf(dist4[2]);
                            break;
                        case "3":
                            distC4003 = distC4003 + Integer.valueOf(dist4[1]);
                            mas3 = mas3 + Integer.valueOf(dist4[2]);
                            break;
                    }
                    break;
            }
        }
        System.out.println("Общая дистанция С100 = " + distC100All);
        System.out.println("Дистанция С100 с номером 1 =" + distC1001);
        System.out.println("Дистанция С100 с номером 2 =" + distC1002);
        System.out.println("Дистанция С100 с номером 3 =" + distC1003);
        System.out.println(distC200All);
        double sumCons;
        sumCons = (distC100All*conC100*petC100)+(distC200All*conC200*petC200C400)+(distC300All*conC300*petC300)+
                (distC400All*conC400*petC200C400);
        System.out.println("Общая стоимость расходов ГСМ = " +sumCons);
        System.out.println("Общая стоимость расходов C100 = " +(distC100All*conC100*petC100));
        System.out.println("Общая стоимость расходов C200 = " +(distC200All*conC200*petC200C400));
        System.out.println("Общая стоимость расходов C300 = " +(distC300All*conC300*petC300));
        System.out.println("Общая стоимость расходов C400 = " +(distC400All*conC400*petC200C400));
        Double[] rash = {(distC100All*conC100*petC100),(distC200All*conC200*petC200C400),(distC300All*conC300*petC300),
        (distC400All*conC400*petC200C400)};
        for (int i = 0; i<=rash.length-2; i++) {
            if (rash[i]>rash[i+1]) {
                double a = rash[i+1];
                rash [i+1] = rash[i];
                rash [i] = a;
                //System.out.println(rash[i+1]);
            }

        }
        Double[] rash1 = {(distC100All*conC100*petC100),(distC200All*conC200*petC200C400),(distC300All*conC300*petC300),
                (distC400All*conC400*petC200C400)};
        for (int i = rash1.length-1; i>=1; i--) {
            if (rash1[i]<rash1[i-1]) {
                double a = rash1[i-1];
                rash1 [i-1] = rash1[i];
                rash1 [i] = a;
                //System.out.println(rash1[i-1]);
            }

        }
        System.out.println("Максимальный расход = " +rash[rash.length-1]);
        System.out.println("Минимальный расход = " +rash1[0]);*/

        // write your code here
    }
    public void sumcons () {

    }
}
