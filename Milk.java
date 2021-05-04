/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

/**
 *
 * @author Andre Goncalves
 * Milk's class. It returns name and price.
 * It extends the Item class, inherits from Item's class 
 */
public class Milk extends Item {
    
    private String name;
    private int price;
    
    
      public Milk(String name, int price) {

         
    }
      
    /**
     * @return the name
     */
    public String getName() {
        return name = "Milk";
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price = 3;
    }
        
 /**
  * 
  * @return Overriding method, used to override the first given price and return the new price
  */
    
        @Override
    public int price() {
        
        return 4;
    }  
}
