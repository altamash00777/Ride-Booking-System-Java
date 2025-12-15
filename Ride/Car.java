package Ride;

public class Car extends Vehicle{
  public  Car(String vehiclenumber){
        super(vehiclenumber);
   
    }

@Override

public double calculatefare(double distance){
    return distance*15;
}

}
