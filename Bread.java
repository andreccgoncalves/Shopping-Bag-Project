/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author Andre Goncalves
 * Bread's class. It returns name and price
 * It extends the Item class, inherits from Item's class 
 */
public class Bread extends Item {

    private String name;
    private int price;

    public Bread(String name, int price) {

    }

    /**
     * @return the name
     */
    public String getName() {
        return name = "Bread";
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price = 2;
    }
    
    //
    /**
     * 
     * @return Overriding method, used to override the first given price and return the new price
     */
    @Override
    public int price() {

        return 3;
    }
}
