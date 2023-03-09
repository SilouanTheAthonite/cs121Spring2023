import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Project 2 - Jukebox Hero
 * Opens a music catalog file, and prints stats about the catalog
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class JukeboxHero {
    
    public static void main(String[] args){

        Scanner keyboardInput = new Scanner(System.in);
        String command = "m";
        ArrayList<Song> songList = new ArrayList<Song>();
        
        while(command.equals("m") || command.equals("M")){
            System.out.println("*****************************");
            System.out.println("*      Program Menu         *");
            System.out.println("*****************************");
            System.out.println("(L)oad catalog");
            System.out.println("(S)earch catalog");
            System.out.println("(A)nalyse catalog");
            System.out.println("(P)rint catalog");
            System.out.println("(Q)uit");
            System.out.println();
            System.out.print("Please enter a command (press 'm' for Menu): ");
            
            command = keyboardInput.next();

            switch (command)
            {
                case "l":
                    System.out.println("Load Catalog...");
                    System.out.print("Please enter filename: ");

                    String fileInput = keyboardInput.next();

                    try
                    {
                        File file = new File(fileInput);
                        Scanner fileScan = new Scanner(file);
                        Scanner lineScan = null;
                        String line = "", artist = "", album = "", title = "", duration = "";
                        
                        while (fileScan.hasNext()){
                            line = fileScan.nextLine();

                            lineScan = new Scanner(line);

                            lineScan.useDelimiter(",");

                            artist = lineScan.next();
                            album = lineScan.next();
                            title = lineScan.next();
                            duration = lineScan.next();

                            Song song = new Song(artist, album, title, (Integer.parseInt(duration)));

                            songList.add(song);

                            lineScan.close();
                        }
                        for (Song a: songList)
                        {
                            System.out.println(a);
                        }
                    } catch (FileNotFoundException e)
                    {
                        System.out.println("Unable to open file: " + fileInput);
                        System.out.print("Please enter a command (press 'm' for Menu): ");
                        command = keyboardInput.next();
                    }

                case "q":
                    System.out.println("Goodbye!");
                    break;

                case "Q":
                    System.out.println("Goodbye!");
                    break;

                case "m":
                    // Resets menu prompts
                    break;

                case "M":
                    // Resets menu prompts
                    break;

                default:
                    System.out.println("Invalid selection!");
                    System.out.print("Please enter a command (press 'm' for Menu): ");
                    command = keyboardInput.next();
                    break;
            }
        }
        keyboardInput.close();
    }
}