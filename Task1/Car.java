public class Car {
    private String typeCar; //Тип авто
    private String gosNum; //Гос номер авто
    private Integer dist; //Пробег
    private Double rash; //Расход
    private Double petrCost; //Стоимость топлива
    private Integer extra; //Дополнительный параметр

    public Car (String typeCar, String gosNum, Integer dist) {
        this.typeCar = typeCar;
        this.gosNum = gosNum;
        this.dist = dist;
    }
    public Car (String typeCar, String gosNum, Integer dist, Integer extra) {
        this.typeCar = typeCar;
        this.gosNum = gosNum;
        this.dist = dist;
        this.extra = extra;
    }
    public void typeDist () {
        if (typeCar == "C100") {
            System.out.println(typeCar + " - " + gosNum + " - " + dist);
        }
        else if (typeCar == "C200"){
            System.out.println(typeCar + " - " + gosNum + " - " + dist + " - " + extra);
        }
    }
}