import java.text.NumberFormat;

/**
 * Represents an online sale
 * @semester Spring 2023
 * @author Bryce Younger
 */

public class CatalogItem {
    // Instance variables 
    private double price; // @keyterm, encapsulation
    private String name;
    private String description;
    private double weight;
    private boolean inStock;

    // Constructors
    /**
     * Creates a CatalogItem
     * @param name name of the item
     * @param price price of the item
     */
    public CatalogItem(String name, double price){
        this.name = name;
        setPrice(price);

        description = "No Description provided";
        weight = 0;
        inStock = false;
    }


    /**
     * Creates a CatalogItem
     * @param name name of item
     * @param price cost of item
     * @param description long description of item to display on sale page
     */
    public CatalogItem(String name, double price, String description){
        this.name = name;
        setPrice(price);
        this.description = description;

        weight = 0;
        inStock = false;
    }

    // Getters/Setters
    /**
     * 
     * @return price of the item
     */
    public double getPrice(){ // @keyterm, return type
        return price;
    }

    /**
     * Sets price if price is greater than 0
     * @param price new price of the item
     */
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    /**
     * 
     * @return long catalog description of item
     */
    public String getDescription(){
        return description;
    }

    /**
     * 
     * @param descript new full description of item
     */
    public void setDescription(String descript){
        description = descript;
    }

    /**
     * 
     * @return the name of the item
     */
    public String getName(){ // @keyterm, visibility modifier
        return name;
    }

    // Utility methods

    /**
     * Returns a String to be used for display
     * in the format
     * 
     * <name> (<price>)
     * <description>
     */
    @Override
    public String toString(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String display = name + "(" + currency.format(price) + ")";
        display += "\n" + description;

        return display;
    }


}
