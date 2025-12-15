package Ride;

public class User extends Person{
 
    public User(String name,String phone){
        super(name,phone);
    }
public void bookride(){
    System.out.println(name+" Booked ride");
}
}