import java.util.ArrayList;
import java.text.DecimalFormat;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;

/**
 * Manages a collection of posts, and provides methods for interacting with their data.
 * Whenever a new post is created, its ID is appened to the end of the file, when delelted, the file is rewritten without the deleted portion.
 * @author Bryce Younger
 * @semsester Spring 2023
 */
public class TextBook implements TextBookInterface {

    private ArrayList<Post> posts;
    private int lastID;
    private DecimalFormat df = new DecimalFormat("00000");

    @Override
    public int getLastID() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLastID'");
    }

    @Override
    public int getPostCount() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostCount'");
    }

    @Override
    public String getPostString(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPostString'");
    }

    @Override
    public boolean addPost(String author, String text) {
        lastID ++;
        String postAuthor = author;
        String postText = text;
        int postID = lastID;
        Post newPost = new Post(postID, postAuthor, postText);

        try{
            PrintWriter pw = new PrintWriter(new FileOutputStream(new File(POST_LIST_FILENAME)));
            pw.println(postID);
            pw.close();
            return true;
        }
        catch (Exception filenotfoundException){
            System.out.println("Unable to add Post!");
            return false;
        }
    }

    @Override
    public Post removePost(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removePost'");
    }

    @Override
    public boolean addComment(int postIndex, String author, String text) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addComment'");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosts'");
    }
    
    @Override
    public ArrayList<Post> getPosts() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPosts'");
    }
    
}
