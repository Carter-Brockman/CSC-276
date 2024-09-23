package MakeACar;

public class CarTest {

    public static void main(String[] args){

        Car car1 = new Car();
        Car car2 = new Car();

        car1.setMake("Toyota");
        car1.setModel("Corolla");
        car1.setSpeed(180);

        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setSpeed(200);

        car1.displayInfo();
        System.out.printf("%s%.2f\n\n", "Speed in MPH: ", Car.convertSpeedToMPH(car1.getSpeed()));

        car2.displayInfo();
        System.out.printf("%s%.2f", "Speed in MPH: ", Car.convertSpeedToMPH(car2.getSpeed()));

    }

}
