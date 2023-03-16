import java.util.Scanner; 
import java.util.Random;
/**
 * Generates a D20 roll for a Dnd instance, with or without advantage/disadvantage
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class DndD20Roll{
    
    private boolean advantage;
    private boolean disadvantage;
    private boolean d20RollType;
    private int d20Roll;
    
    /**
     * 
     * @param adv
     * @return whether or not the player has advantage
     */
    public boolean setAdvantage(boolean adv){
        this.advantage = adv;
        
        return advantage;
    }

    /**
     * 
     * @param dis
     * @return whether or not the player has disadvantage
     */
    public boolean setDisadvantage(boolean dis){
        this.disadvantage = dis;

        return disadvantage;
    }

    /**
     * 
     * @param adv
     * @param dis
     * @return determines whether two dice rolls are needed
     */
    public boolean setd20Roll(boolean adv, boolean dis){
        String litAdv = valueOf(adv);
        String litDis = valueOf(dis);
        
        if (litAdv.equals(litDis))
        {
            this.d20RollType(true);
        }
        else
        {
            this.d20RollType(false);
        }

        return d20RollType;
    }


    public int getD20Roll(boolean advOrDis){
        Random diceRoll = new Random();
        int firstRoll = diceRoll.nextInt(20) + 1;
        int secondRoll = diceRoll.nextInt(20) + 1;
        int finalRoll;

        if (valueOf(advOrDis).equals(true))
        {
            finalRoll = Math.max(firstRoll, secondRoll);
        }
        else if (valueOf(advOrDis).equals(false))
        {
            finalRoll = Math.min(firstRoll, secondRoll);
        }
        return finalRoll;
    }



    public static void main(String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Welcome to Dungeons and Dragons d20 Roll!");
        System.out.print("Do you have advantage? ");
        
        String advResponse = userInput.next();
        String disResponse;
        
        if ((advResponse.equals("yes")) || (advResponse.equals("Yes")) || (advResponse.equals("y")) || (advResponse.equals("Y")))
        {
            advResponse.setAdvantage(true);
            disResponse.setDisadvantage(false);
        }
        else if ((advResponse.equals("no")) || (advResponse.equals("No")) || (advResponse.equals("n")) || (advResponse.equals("N")))
        {
            advResponse.setAdvantage(false);
            
            System.out.println();
            System.out.print("Do you have disadvantage? ");

            disResponse = userInput.next();

            if ((disResponse.equals("yes")) || (disResponse.equals("Yes")) || (disResponse.equals("y")) || (disResponse.equals("Y")))
            {
                disResponse.setDisadvantage(true);
            }
            else if ((disResponse.equals("no")) || (disResponse.equals("No")) || (disResponse.equals("n")) || (disResponse.equals("N")))
            {
                disResponse.setDisadvantage(false);
            }
            else
            {
                System.out.println();
                System.out.print("Invalid response. Goodbye.");
            }
        }
        else
        {
            System.out.println();
            System.out.print("Invalid response. Goodbye.");
        }

        Sytem.out.println();

        Boolean d20RollType;
        d20RollType.setD20Roll(advResponse, disResponse);

        int diceRoll;

        if (valueOf(d20RollType).equals(false))
        {
            if (valueOf(advResponse).equals(true))
            {
                diceRoll = getD20Roll(true);
            }
            else if (valueOf(disResponse).equals(true))
            {
                diceRoll = getD20Roll(false);
            }
            
        }


        userInput.close();
    }
}