import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gmbordelon on 2/21/2015.
 */
public class Customer {
    public String customerName;
    public ArrayList customerRecOrder;
    public ArrayList newOrder;
    public double customerLocation;
    public String userName;
    public String userPassword;
    public Scanner userInput = new Scanner(System.in);

    public Customer(String name, ArrayList recOrder, double location)
    {
        setName(name);
        setRecOrder(recOrder);
        setLocation(location);
    }


    public void setName(String name)
    {
        customerName = name;
    }

    public String getName()
    {
        return customerName;
    }

    public void setRecOrder(ArrayList rec_Order)
    {
        customerRecOrder = rec_Order;
    }

    public ArrayList getRecOrder()
    {
        return customerRecOrder;
    }

    public void setLocation(double curr_Location)
    {
        customerLocation = curr_Location;
    }

    public double getLocation()
    {
        return customerLocation;
    }

    public void setUserName(String user_Name)
    {
        userName = user_Name;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserPassword(String user_Password)
    {
        userPassword = user_Password;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public ArrayList createOrder()
    {
        newOrder = new ArrayList();
        boolean tF = true;
        String tempItem;
        while (tF)
        {
            System.out.println("Enter item to add or \"Cancel\": ");
            tempItem = userInput.next();
            if (tempItem == "Cancel" || tempItem == "cancel")
            {
                tF = false;
                break;
            }
            newOrder.add(tempItem);
        }
        return newOrder;
    }







}
