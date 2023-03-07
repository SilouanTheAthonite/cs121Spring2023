import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Lesson 13: Activity - GradeBook
 *
 * @author CS121 Instructors
 * @version Spring 2023
 * @author Bryce Younger
 */
public class GradeBook {

	public static void main(String[] args) {
		
		/* TODO: 1. Create a new ArrayList of Student objects called gradebook. */
		
		ArrayList<Student> gradebook = new ArrayList<Student>();
		
		/* TODO: 2. Create a new File object for gradebook.csv and 
		 * a new Scanner object to parse it. Catch any required 
		 * exceptions and display a useful message to the user.
		 */
		
		try{ 
			File file = new File("gradebook.csv");
			Scanner fileScan = new Scanner(file); // @keyterm, scanner
			Scanner lineScan = null;
			String line = "", lastName = "", firstName = "", studentId = "", grade = "";
			while(fileScan.hasNext()){
				line = fileScan.nextLine();

				lineScan = new Scanner(line);

				lineScan.useDelimiter(","); // @keyterm, delimiter

				lastName = lineScan.next(); // @keyterm, token
				firstName = lineScan.next(); // @keyterm, parsing
				studentId = lineScan.next();
				grade = lineScan.next();

				Student student = new Student(firstName, lastName, (Integer.parseInt(studentId)));
				student.setGrade(Integer.parseInt(grade)); 

				gradebook.add(student);

				lineScan.close();
			}
			for(Student h: gradebook)
			{
				System.out.println(h);
			}
		} catch(FileNotFoundException e){ // @keyterm, catching  an exception
			System.out.println("Could not find the file");
		}
		
				
			/* TODO: 3. Use a while loop and the Scanner created above to iterate 
			 * through the lines in the gradebook.csv file.
			 */


				/* TODO: 4. For each line (student record), use a second 
				 * Scanner object to tokenize the line using a comma (',')
				 * as the delimiter, extract values for lastName, firstName,
				 * id and grade and store them to local variables.
			 	 */


			 	/* TODO: 5. Create a new Student object using the local variables
			 	 * create above, set the student's grade, and finally add the 
			 	 * new Student object to the gradebook ArrayList. 
				 */

		
		
		/* TODO: 6. Use a foreach loop to print out contents of the gradebook */

		

	}

}

