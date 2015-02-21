/**
 * Created by gmbordelon on 2/21/2015.
 *
 * @author Justin Hahn
 */
public class FoodTruck {
    public String truckName;
    public String phoneNumber;
    public double locationTruck;
    public String truckUserName;
    public String truckPassword;

    //the constructor for the truck
    public FoodTruck(String name, String phNum, double location, String userName, String password) {
        truckName = name;
        phoneNumber = phNum;
        locationTruck = location;
        truckUserName = userName;
        truckPassword = password;

    }

    //The naming methods for the truck
    public void setName(String name) {
        truckName = name;
    }

    public String getName() {
        return truckName;
    }

    //The phone number methods for the truck
    public void setPhoneNumber(String phNumber) {
        phoneNumber = phNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    //the location methods for the truck
    public void setLocation(double location) {
        locationTruck = location;
    }

    public double getLocation() {
        return locationTruck;
    }

    //UserName methods for the truck
    public void setUserName(String userName) {
        truckUserName = userName;
    }

    public String getUserName() {
        return truckUserName;
    }

    //password methods for the truck
    public void setPassword(String pass) {
        truckPassword = pass;
    }

    public String getPassword() {
        return truckPassword;
    }

}
