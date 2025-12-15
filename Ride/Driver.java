package Ride;

public class Driver extends Person{
    public Driver(String name,String phone){
        super(name,phone);
    }
    public void pickedride(){
        System.out.println(name+ " picked ride");
    }

}