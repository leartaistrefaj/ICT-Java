package Vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("BMW", "Zeze");
        WheeledVehicle wh1 = new WheeledVehicle("Mercedes", "Bardhe",4);
        Boat b1 = new Boat("Lamborghini","Kaltert","LamboBoat",120,3.4);
        Car c1 = new Car("Audi","Kuqe",4,70000,260,"Diesel");
        Bicycle by1 = new Bicycle("Scott","Gjelbert",2,"Contessa");
        TwoDoor t1 = new TwoDoor("Ferrari modest","Kuqe",4,70000,300,"Benzine",2);
        FourDoor f1 = new FourDoor("Range Rover ","Bardhe",4,80000,250,"Diesel",4);

        System.out.println(v1);
        System.out.println("----------------------------------------");
        System.out.println(wh1);
        System.out.println("----------------------------------------");
        System.out.println(b1);
        System.out.println("----------------------------------------");
        System.out.println(c1);
        System.out.println("----------------------------------------");
        System.out.println(by1);
        System.out.println("----------------------------------------");
        System.out.println(t1);
        System.out.println("----------------------------------------");
        System.out.println(f1);
        System.out.println("----------------------------------------");

    }


}
