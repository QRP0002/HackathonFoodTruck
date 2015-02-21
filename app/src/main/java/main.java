import java.util.ArrayList;

/**
 * Created by gmbordelon on 2/21/2015.
 */
public class main {

    ArrayList<Customer> customerArray = new ArrayList<>();
    ArrayList<Truck> truckArray = new ArrayList<>();

    public void createCustomer(String name, ArrayList recOrder, double location)
    {
        Customer tempCustomer = new Customer(name, recOrder, location);
        customerArray.add(tempCustomer);
    }

    public void createTruck(String name, String phoneNum, double location, String userName, String userPassword)
    {
        Truck tempTruck = new Truck(String name, String phoneNum, double location, String userName, String userPassword);
        truckArray.add(tempTruck);
    }

    public void createAdmin(String name, String userName, String userPassword)
    {
        
    }


}
