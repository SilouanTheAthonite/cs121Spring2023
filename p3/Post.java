import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Bryce Younger
 * @semester Spring 2023
 */
public class Post implements PostInterface{
    
    private String author;
    private String text;
    private Instant timestamp;
    private int postID;
    private ArrayList<String> comments;
    private DecimalFormat df = new DecimalFormat("00000");

    /**
     * Creates a brand new Post
     * @param postId
     * @param author
     * @param text
     */
    public Post(int postId, String author, String text) {
        this.timestamp = Instant.now();
        this.postID = postId;
        this.author = author;
        this.text = text;
        this.comments = new ArrayList<String>();

        try{
            PrintWriter pw = new PrintWriter(new File("Post-" + df.format(postId) + ".txt"));
            pw.print(df.format(postId) + " ");
            pw.print(timestamp.toString() + " ");
            pw.print(author + " ");
            pw.println(text);
            pw.close();
        }
        catch (Exception filenotfoundException){
            System.out.println("File not found!");
        }
    }

    /**
     * Restores a Post from data stored in an extisting post file
     * @param postID
     */
    public Post(int postID){
        this.postID = postID;
        
        File file = new File("Post-" + df.format(postID) + ".txt");

        try{
            Scanner fileScan = new Scanner(file);
            String line = fileScan.nextLine();
            Scanner lineScan = new Scanner(line);
            postID = Integer.parseInt(lineScan.next());
            timestamp = Instant.parse(lineScan.next());
            author = lineScan.next();
            text = lineScan.next();
            
            while(lineScan.hasNext())
            {
                text = text + " " + lineScan.next();
            }
            while(fileScan.hasNext())
            {
                comments.add(fileScan.nextLine());
            }

            fileScan.close();
            lineScan.close();
        }
        catch (Exception filenotfoundException){
            System.out.println("File could not be recovered!");
        }
    }

    @Override
    public void addComment(String author, String text) {
        timestamp = Instant.now();
        String comment = timestamp + " " + author + " " + text;

        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File("Post-" + df.format(postID) + ".txt"), true));
            pw.println(comment);
            pw.close();
            comments.add(comment);
        }
        catch (Exception filenotfoundException){
            System.out.println("Comment could not be added!");
        }
    }
    
    @Override
    public String toString() {
        String updatedPost = "";

        updatedPost = "Post:" + "\n" + df.format(postID) + " " + timestamp + " " + 
        author + " " + text + "\n" + "Comments:" + "\n";
        
        for(String c: comments)
        {
            updatedPost += c + "\n";
        }

        return updatedPost;
    }

    @Override
    public String toStringPostOnly() {
        return df.format(postID) + " " + timestamp + " " + author + " " + text;
    }

    @Override
    public String getFilename() {
        return "Post-" + df.format(postID) + ".txt";
    }

    @Override
    public int getPostID() {
        return postID;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    
}
