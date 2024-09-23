package MakeACar;

public class Car {

    private String make;
    private String model;
    private int speed;

    public void setMake(String theMake)
    {
        make = theMake;
    }
    public String getMake()
    {
        return make;
    }
    public void setModel(String theModel)
    {
        model = theModel;
    }
    public String getModel()
    {
        return model;
    }
    public void setSpeed(int theSpeed)
    {
        speed = theSpeed;
    }
    public int getSpeed()
    {
        return speed;
    }

    public void displayInfo()
    {
        System.out.println("Make: " + getMake() + "\nModel: " + getModel() + "\nSpeed: " + getSpeed());
    }

    public static double convertSpeedToMPH(int speedInKmh)
    {
        return speedInKmh * 0.621371;
    }

}
