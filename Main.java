import Ride.*;

public class Main{
    public static void main(String[] args) {
         User user = new User("Altamash", "8009634553");
        Driver driver = new Driver("Rahul", "9123456789");
        Vehicle vehicle = new Bike("UP70CM2004");
    
    all ride=new all(user,driver,vehicle,10);

    ride.startride();
    ride.pickedride();
    
    }
}