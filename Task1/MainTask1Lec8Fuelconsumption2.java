public class MainTask1Lec8Fuelconsumption2 {
	public static void main(String[] args){
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
        for (String x: inData) {
            String[] dist = x.split("_");
            String[] dist1 = dist[1].split("-");
            if (String.valueOf(dist[0]) == "C100") {
                cars[i] = new Car(dist[0], dist1[0], Integer.valueOf(dist1[1]));
                i++;
                System.out.println(dist[0]);
            }
            else {
                cars[i] = new Car(dist[0],dist1[0],Integer.valueOf(dist1[1]),Integer.valueOf(dist1[dist1.length-1]));
                i++;
            }
        }
        //cars[0].typeDist();
        for (int j = 0; j < cars.length ; j++) {
            cars[j].typeDist();
        }
                    }
            


/*double petrolTypeZ11 = 46.10;
double petrolTypeZ12 = 47.50;
double petrolTypeZ13 = 48.90;
int rashodAlltogether = 15;
double rashodZ11 = 12.5;
double rashodZ12 = 12;
double rashodZ13 = 11.5;
double Z11All = 0;
double Z12All = 0;
double Z13All = 0;
/*for (String x: distance) {
	String[] dist1 = x.split("-");
	switch (dist1[0]){
		case "Z11":
					Z11All = Z11All + Integer.valueOf(dist1[1]);
					break;
		case "Z12":
					Z12All = Z12All + Integer.valueOf(dist1[1]);
					break;
		case "Z13":
					Z13All = Z13All + Integer.valueOf(dist1[1]);
					break;
	}	
}
/*System.out.println(Z11All);
System.out.println(Z12All);
System.out.println(Z13All);*/
/*double fuelCosts15_Z11 = Z11All / 100 * rashodAlltogether * petrolTypeZ11;
double fuelCosts15_Z12 = Z12All / 100 * rashodAlltogether * petrolTypeZ12;
double fuelCosts15_Z13 = Z13All / 100 * rashodAlltogether * petrolTypeZ13;
double fuelCosts15_l = fuelCosts15_Z11 + fuelCosts15_Z12 + fuelCosts15_Z13;
System.out.println("All fuel costs if rashod 15-l for 100km will be: "+fuelCosts15_l);
if (fuelCosts15_Z11>fuelCosts15_Z12 && fuelCosts15_Z11>fuelCosts15_Z13){ 
	System.out.println("Max rashod_costs for 15-l na 100km - Z11");}
else if (fuelCosts15_Z12>fuelCosts15_Z11 && fuelCosts15_Z12>fuelCosts15_Z13){
	System.out.println("Max rashod_costs for 15-l na 100km - Z12");}
else if (fuelCosts15_Z13>fuelCosts15_Z11 && fuelCosts15_Z13>fuelCosts15_Z12){ 
	System.out.println("Max rashod_costs for 15-l na 100km - Z13");}
else {System.out.println("Some of rashod for 15-l na 100km is equal");}
if (fuelCosts15_Z11<fuelCosts15_Z12 && fuelCosts15_Z11<fuelCosts15_Z13){ 
	System.out.println("Min rashod_costs for 15-l na 100km - Z11");}
else if (fuelCosts15_Z12<fuelCosts15_Z11 && fuelCosts15_Z12<fuelCosts15_Z13){
	System.out.println("Min rashod_costs for 15-l na 100km - Z12");}
else if (fuelCosts15_Z13<fuelCosts15_Z11 && fuelCosts15_Z13<fuelCosts15_Z12){ 
	System.out.println("Min rashod_costs for 15-l na 100km - Z13");}
double fuelCosts_Z11 = Z11All / 100 * rashodZ11 * petrolTypeZ11;
double fuelCosts_Z12 = Z12All / 100 * rashodZ12 * petrolTypeZ12;
double fuelCosts_Z13 = Z13All / 100 * rashodZ13 * petrolTypeZ13;
double fuelCosts_l = fuelCosts_Z11 + fuelCosts_Z12 + fuelCosts_Z13;
/*System.out.println(fuelCosts_Z11);
System.out.println(fuelCosts_Z12);
System.out.println(fuelCosts_Z13);*/
/*System.out.println("All fuel costs if rashod not 15-l for 100km will be: "+fuelCosts_l);
if (fuelCosts_Z11>fuelCosts_Z12 && fuelCosts_Z11>fuelCosts_Z13){ 
	System.out.println("Max rashod_costs for rashod "+rashodZ11+"-l na 100km - Z11");}
else if (fuelCosts_Z12>fuelCosts_Z11 && fuelCosts_Z12>fuelCosts_Z13){
	System.out.println("Max rashod_costs for rashod "+rashodZ12+"-l na 100km - Z12");}
else if (fuelCosts_Z13>fuelCosts_Z11 && fuelCosts_Z13>fuelCosts_Z12){ 
	System.out.println("Max rashod_costs for rashod "+rashodZ13+"-l na 100km - Z13");}
else {System.out.println("Some of rashod for rashod Not 15-l na 100km is equal");}
if (fuelCosts_Z11<fuelCosts_Z12 && fuelCosts_Z11<fuelCosts_Z13){ 
	System.out.println("Min rashod_costs for rashod "+rashodZ11+"-l na 100km - Z11");}
else if (fuelCosts_Z12<fuelCosts_Z11 && fuelCosts_Z12<fuelCosts_Z13){
	System.out.println("Min rashod_costs for rashod "+rashodZ12+"-l na 100km - Z12");}
else if (fuelCosts_Z13<fuelCosts_Z11 && fuelCosts_Z13<fuelCosts_Z12){ 
	System.out.println("Min rashod_costs for rashod "+rashodZ13+"-l na 100km - Z13");}
	}*/
}