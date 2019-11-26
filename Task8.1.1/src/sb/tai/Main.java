package sb.tai;

public class Main {

    public static void main(String[] args) {
        String[] inData = {"C100_1-100",
                "C200_1-120-1200",
                "C300_1-120-30",
                "C400_1-80-20",
                "C100_2-50",
                "C200_2-40-1000",
                "C300_2-200-45",
                "C400_2-10-20",
                "C100_3-10",
                "C200_3-170-1100",
                "C300_3-150-29",
                "C400_3-100-28",
                "C100_1-300",
                "C200_1-100-750",
                "C300_1-32-15"};
        Car[] cars = new Car[inData.length];
        int i = 0;
        int copyPos = -1;// позиция повторяющегося элемента
        for (String x : inData) {
            String[] dist = x.split("_");
            String[] dist1 = dist[1].split("-");
            if (i > 0) {
                copyPos = CarsUtils.copyFinder(cars, dist[0], dist1[0]);
            }
            if (copyPos > -1) {
                cars[copyPos].addProbeg(Integer.valueOf(dist1[1]));
                copyPos = -1;
                continue;
            }
            if (dist[0].equals("C100")) {
                cars[i] = new Car(dist[0], dist1[0], Integer.valueOf(dist1[1]), 46.10, 12.5);
                i++;
                //System.out.println(dist[0]);
            } else if (dist[0].equals("C200")) {
                cars[i] = new Car(dist[0], dist1[0], Integer.valueOf(dist1[1]), Integer.valueOf(dist1[dist1.length - 1]),
                        48.90, 12d);
                i++;
            } else if (dist[0].equals("C300")) {
                cars[i] = new Car(dist[0], dist1[0], Integer.valueOf(dist1[1]), Integer.valueOf(dist1[dist1.length - 1]),
                        47.50, 11.5);
                i++;
            } else if (dist[0].equals("C400")) {
                cars[i] = new Car(dist[0], dist1[0], Integer.valueOf(dist1[1]), Integer.valueOf(dist1[dist1.length - 1]),
                        48.90, 20d);
                i++;
            }
        }


        //cars[0].typeDist();
        System.out.println(i);
        for (int j = 0; j < i; j++) {
            cars[j].typeDist();
        }
        System.out.println("Общие затраты на топливо = " + CarsUtils.rashALL(cars, i));
        System.out.println("Затраты на топливо С100 = " + CarsUtils.rashC100(cars, i));
        System.out.println("Затраты на топливо С200 = " + CarsUtils.rashC200(cars, i));
        System.out.println("Затраты на топливо С300 = " + CarsUtils.rashC300(cars, i));
        System.out.println("Затраты на топливо С400 = " + CarsUtils.rashC400(cars, i));
        CarsUtils.maxRash(cars, i);
        CarsUtils.minRash(cars, i);
        CarsUtils.sortProbegC100(cars, i);
    }
}