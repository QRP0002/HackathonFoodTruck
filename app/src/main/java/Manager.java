import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gmbordelon on 2/21/2015.
 */
public class Manager {

    ArrayList<Customer> customerArray = new ArrayList<>();
    ArrayList<Truck> truckArray = new ArrayList<>();
    Scanner userInput = new Scanner(System.in);


    public void createCustomer(String name, ArrayList recOrder, double location)
    {
        Customer tempCustomer = new Customer(name, recOrder, location);
        customerArray.add(tempCustomer);
    }

    public void createTruck()
    {
        String name, phoneNum, userName, userPassword;
        double Xlocation, Ylocation;
        System.out.println("Enter the truck's name: ");
        name = userInput.next();
        System.out.println("Enter the truck's phone number: ");
        phoneNum = userInput.next();
        System.out.println("Enter the truck's Xlocation: ");
        Xlocation = userInput.nextDouble();
        System.out.println("Enter the truck's Ylocation: ");
        Ylocation = userInput.nextDouble();
        System.out.println("Enter the trucks login username: ");
        userName = userInput.next();
        System.out.println("Enter the truck's login password: ");
        userPassword = userInput.next();


        Truck tempTruck = new Truck(name, phoneNum, Xlocation, Ylocation, userName, userPassword);
        truckArray.add(tempTruck);
    }

    /*
    public void createFood(String name, double salePrice, int quantity, int amtPerCase)
    {
        Food tempFood = new Food(name, salePrice, quantity, amtPerCase);
    }
    */




}
