//Class: CSE 1322L
//Section: J03
//Term: Spring 2023
//Name: Asher Graham

import java.util.Scanner;
class Lab2 {
    public static void main(String[] args){

        //declare scanner and variables
        Scanner scan = new Scanner(System.in);
        int intQuit = 0, intInput;
        float fltInput;

        //create objects
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60f, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98f, 30);

        //remember System.out.printf("%.2f", milk.getPrice()); to print correctly formatted price
        //main loop
        do {
            System.out.println("1. Sold One Milk\n" +
                    "2. Sold One Bread\n" +
                    "3. Change price of Milk\n" +
                    "4. Change price of Bread\n" +
                    "5. Add Milk to Inventory\n" +
                    "6. Add Bread to Inventory\n" +
                    "7. See Inventory\n" +
                    "8. Quit");
            switch (Integer.parseInt(scan.nextLine())) {
                case 1:
                    milk.lowerQuantity();
                    break;
                case 2:
                    bread.lowerQuantity();
                    break;
                case 3:
                    System.out.println("What is the new Price for milk?");
                    fltInput = Float.parseFloat(scan.nextLine());
                    milk.setPrice(fltInput);
                    break;
                case 4:
                    System.out.println("What is the new Price for bread?");
                    fltInput = Float.parseFloat(scan.nextLine());
                    bread.setPrice(fltInput);
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    intInput = Integer.parseInt(scan.nextLine());
                    milk.raiseQuantity(intInput);
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    intInput = Integer.parseInt(scan.nextLine());
                    bread.raiseQuantity(intInput);
                    break;
                case 7:
                    System.out.println("Milk: "+milk+"\nBread: "+bread);
                    break;
                case 8:
                    intQuit++;
                    break;
                default:
                    System.out.println("Please input a valid number.");
                    break;
            }
        } while(intQuit==0);
    }
}