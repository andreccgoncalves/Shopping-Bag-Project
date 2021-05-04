/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author Andre Goncalves
 * abstract class that the other class will inherit from it, gets name and price
 * Items have price and name
 */
public abstract class Item { 
    
    public String name;
    public int price;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }
/**
 * 
 * @return all items have price, it returns the price
 */
        public abstract int price(); 
            
}




