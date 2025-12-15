package Ride;

public class all{
    private User user;
    private Driver driver;
    private Vehicle vehicle;
    private double distance;

public all(User user,Driver driver,Vehicle vehicle,double distance){
    this.user=user;
    this.driver=driver;
    this.vehicle=vehicle;
    this.distance=distance;
    
}
public void startride(){
    user.bookride();
    driver.pickedride();
    System.out.println("Ride started....");
}
public void pickedride(){
    double fare=vehicle.calculatefare(distance);
    System.out.println("Ride ended....");
    System.out.println("Total fare:"+fare);
}

    
}