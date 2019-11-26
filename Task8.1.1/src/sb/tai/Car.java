package sb.tai;

public class Car {
    private String typeCar; //Тип авто
    private String gosNum; //Гос номер авто
    private Integer dist; //Пробег
    private Double petrCon; //Затраты на топливо с учётом расхода
    private Integer extra; //Дополнительный параметр

    public Car (String typeCar, String gosNum, Integer dist, Double petrCost, Double rash) {
        this.typeCar = typeCar;
        this.gosNum = gosNum;
        this.dist = dist;
        this.petrCon  = dist * petrCost * rash;
    }
    public Car (String typeCar, String gosNum, Integer dist, Integer extra, Double petrCost, Double rash) {
        this.typeCar = typeCar;
        this.gosNum = gosNum;
        this.dist = dist;
        this.extra = extra;
        this.petrCon  = dist * petrCost * rash;
    }

    public void typeDist () {
        if (typeCar.equals("C100")) {
            System.out.println("Тип Авто=" + typeCar + "-Гос номер=" + gosNum + "-Пробег=" + dist + "-Затраты " +
                    "на топливо=" + petrCon);
        }
        else {
            System.out.println("Тип Авто=" + typeCar + "-Гос номер=" + gosNum + "-Пробег=" + dist + "-Затраты " +
                    "на топливо=" + petrCon + "-Дополнительный параметр=" + extra);
        }
    }
    public String getTypeCar () {
        return typeCar;
    }
    public String getGosNum () {
        return gosNum;
    }
    public Integer getDist () {
        return dist;
    }
    public Double getPetrCon () {
        return petrCon;
    }
    public void addProbeg (int addDist) {
        dist = dist + addDist;
    }

}
