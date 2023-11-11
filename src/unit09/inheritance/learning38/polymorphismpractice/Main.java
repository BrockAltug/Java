package unit09.inheritance.learning38.polymorphismpractice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //new array list using Mail class
        ArrayList<Mail> shipments = new ArrayList<>(List.of(new Mail(10), new FastMail(3), new FastMail(4), new Mail(2)));

        //starting shipment cost
        double totalShipmentCost = 0;

        //for each Mail object in the shipments array list
        for (Mail mail : shipments) {
            //call to the calculateShipping() method to add it to the totalShipmentCost
            totalShipmentCost += mail.calculateShipping();
        }
        System.out.println("The total shipment cost is " + totalShipmentCost);
    }
}
