//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.text.DecimalFormat;

public class StockItem {

    //declare variables
    private String description;
    private int id;
    private float price;
    private int quantity;
    private static int count = 0;
    private static final DecimalFormat decFormat = new DecimalFormat("0.00");

    //default constructor
    public StockItem() {
        description = "null";
        id = (count);
        count++;
        price = 0;
        quantity = 0;
    }

    //overloaded constructor
    public StockItem(String newDescription, float newPrice, int newQuantity) {
        description = newDescription;
        id = count;
        count++;
        price = newPrice;
        quantity = newQuantity;
    }

    //toString
    public String toString() {
        return ("Item number: "+id+" is "+description+" has price "+ decFormat.format(price)+" we currently have "+quantity+" in stock");
    }

    //getter methods
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    //setter methods
    public void setPrice(float newPrice) {
        if (newPrice>0) {
            price = newPrice;
        }
        else {
            System.out.println("Error: price must be more than $0.00");
        }
    }

    public void lowerQuantity() {
        if (quantity > 0) {
            quantity -= 1;
        }
        else {
            System.out.println("There is no more product to sell!");
        }
    }

    public void raiseQuantity(int newQuantity) {
        quantity += newQuantity;
    }
}
