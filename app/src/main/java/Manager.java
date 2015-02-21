import java.util.ArrayList;

/**
 * Created by gmbordelon on 2/21/2015.
 */
public class Manager {

    ArrayList<Customer> customerArray = new ArrayList<>();
    ArrayList<Truck> truckArray = new ArrayList<>();


    public void createCustomer(String name, ArrayList recOrder, double location)
    {
        Customer tempCustomer = new Customer(name, recOrder, location);
        customerArray.add(tempCustomer);
    }

    public void createTruck(String name, String phoneNum, double Xlocation, double Ylocation, String userName, String userPassword)
    {
        Truck tempTruck = new Truck(name, phoneNum, Xlocation, Ylocation, userName, userPassword);
        truckArray.add(tempTruck);
    }

    public void createFood(String name, double salePrice, int quantity, int amtPerCase)
    {
        Food tempFood = new Food(name, salePrice, quantity, amtPerCase);
    }




}
