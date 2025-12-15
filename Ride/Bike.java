package Ride;

public class Bike extends Vehicle{
    public Bike(String vehiclenumber){
        super(vehiclenumber);
    }


    @Override
    public double calculatefare(double distance){
        return distance*8;
    }
}
