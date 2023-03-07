import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class StringClassPractice {
    public static void main(String[] args){
        /**
            Strings
         */
        String name = "Frederick the Great";

        // how many characters?
        int numChars = name.length();
        System.out.println(name + " has " + numChars + " letters!");

        // Substring/indexOf to get first name
        int spaceIdx = name.indexOf(" ");
        String fName = name.substring(0, spaceIdx);
        System.out.println(fName);

        // Substring/indexOf to get last name
        spaceIdx = name.indexOf(" ", spaceIdx + 1);
        String lName = name.substring(spaceIdx + 1);
        System.out.println(lName);

        // uppercase
        String shout = name.toUpperCase();
        System.out.println(name);
        System.out.println(shout);

        /**
            DecimalFormat
         */
        double number = 1234.56789123;
        double shortNum = 1.2;

        // Format with 2 decimals
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println(fmt.format(number));
        System.out.println(fmt.format(shortNum));
        System.out.println(fmt.format(.345));

        /**
            NumberFormat
         */

         // Format with US currency
         NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
         System.out.println(currencyFormat.format(number));

         // Format with foreign currency
         NumberFormat chineseFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
         System.out.println(chineseFormat.format(number));
    }
}
