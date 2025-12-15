package Ride;

public abstract class Vehicle{
   protected String vehiclenumber;

public Vehicle(String vehiclenumber){
    this.vehiclenumber=vehiclenumber;
}

public abstract double calculatefare(double distance);

}
