/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import java.util.Scanner;


/**
 *
 * @author Andre Goncalves
 * Student number: 2020195
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ShoppingBag myBag = new ShoppingBag(); //this is myBag. I can buy things to put in it
        getTotal gT = new getTotal(); //this constructor was created to get the total price of the items

        //items initiliased with its names and prices
        Milk m = new Milk("Milk", 4);
        Bread b = new Bread("Bread", 4);
        Juice j = new Juice("Juice", 2);

        Scanner myKb = new Scanner(System.in); //Scanner will read the input from the user

        int response;
        int response2;
        int total = 0;

        //using do while loop, in a way that the user can pick an option and keep buying items 
        do {

            // MENU - it will show for the user a menu with 4 options, 
            // if the user selects an option between 1 and 3, 
            // he/she will be required to add a quantity of products that they want to buy     
            System.out.println("This is our product list:");
            System.out.println("Code| Product Name                  |Unit Price");
            System.out.println("1-    " + m.getName() + "..........................| €" + m.price());
            System.out.println("2-    " + b.getName() + ".........................| €" + b.price());
            System.out.println("3-    " + j.getName() + ".........................| €" + j.price());
            System.out.println("4-    Leave Shop \n ");
            System.out.println("Please select the item(s) you want to buy");
            response = myKb.nextInt();

            if (response != 4) {

                //Switch used to control which option will appear for the user
                switch (response) {
                    case 1:

                        System.out.println("You are selecting milk");
                        System.out.println("How many would you like to buy?");
                        response2 = myKb.nextInt();
                        System.out.println("Milk's total price: €" + gT.getTotal(response2, m.price()));
                        total = total + gT.getTotal(response2, m.price());

                        //for loop created to output the exact quantity of items that were bought
                        for (int i = 0; i < response2; i++) {
                            myBag.buyItem(m.getName()); //adding the items in the ShoppingBag
                        }
                        break;

                    case 2:

                        System.out.println("You are selecting bread");
                        System.out.println("How many would you like to buy?");
                        response2 = myKb.nextInt();
                        System.out.println("Bread's total price: €" + gT.getTotal(response2, b.price()));
                        total = total + gT.getTotal(response2, b.price());
                        for (int i = 0; i < response2; i++) {
                            myBag.buyItem(b.getName());
                        }

                        break;

                    case 3:

                        System.out.println("You are selecting juice");
                        System.out.println("How many would you like to buy?");
                        response2 = myKb.nextInt();
                        System.out.println("Juices's total price: €" + gT.getTotal(response2, j.price()));
                        total = total + gT.getTotal(response2, j.price());
                        for (int i = 0; i < response2; i++) {
                            myBag.buyItem(j.getName());
                        }
                        break;

                    default:
                        break;
                }

            }

        } while (response != 4);
        System.out.println("You purchased the following items: \n");
        System.out.println(myBag.emptyBag()); //it will print out all the items that were bought on the shop
        System.out.println("You shop today cost: €" + total); //shopping total's price
        System.out.println("Thank you for shopping with us!!");

    }
}
