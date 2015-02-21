/**
 * Created by gmbordelon on 2/21/2015.
 *
 * @author Justin Hahn
 */
public class Truck {
    public String truckName;
    public String phoneNumber;
    public double XlocationTruck;
    public double YlocationTruck;
    public String truckUserName;
    public String truckPassword;

    //the constructor for the truck
    public Truck(String name, String phNum, double Xlocation, double Ylocation, String userName, String password) {
        truckName = name;
        phoneNumber = phNum;
        XlocationTruck = Xlocation;
        YlocationTruck = Ylocation;
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
    public void setLocation(double Xlocation, double Ylocation) {
        XlocationTruck = Xlocation;
        YlocationTruck = Ylocation;
    }

    public String getLocation() {
        String locationTruck = Double.toString(XlocationTruck) + Double.toString(YlocationTruck);
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
