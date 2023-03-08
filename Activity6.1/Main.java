/**
 * Driver for CatalogItem
 * Tests the functionality of CatalogItem
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class Main { // @keyterm, driver class
    public static void main(String[] args){
        // Test Constructors
        CatalogItem  banana = new CatalogItem("Golden banana", 0.45);
        CatalogItem legendaryDragon = new CatalogItem("Legendary Purple People Eater", 
         1345678,
             "The legendary purple people eater of lore. Beware of fire.");


            System.out.println("Banana: ");
            System.out.println(banana);

            System.out.println("Dragon: ");
            System.out.println(legendaryDragon);

            // Test get/set Price
            for(int i = -1; i < 2; i ++){
                banana.setPrice(i);
                if(i > 0){
                    System.out.print("Banana should be" + i + " : ");
                    System.out.println(banana.getPrice());
                } else {
                    System.out.println("Price shouldn't change");
                    System.out.println(banana.getPrice());
                }

            }

            // Test getname
            String actualName =  legendaryDragon.getName();
            System.out.println("Name of dragon: " + actualName);

            // Test get/set Description
            String newDescription = "lonely dragon without treasure";
            legendaryDragon.setDescription(newDescription);
            System.out.println("Description should be: " + newDescription);
            System.out.println("Actual: " + legendaryDragon.getDescription());

    } 
}
