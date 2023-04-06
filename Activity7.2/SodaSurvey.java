import java.util.Scanner;
import java.io.File;
/**
 * Contains a constructor and methods for SodaSurveyDriver implemented from SodaSurveyInterface
 * @semester Spring 2023
 * @author Bryce Younger
 */
public class SodaSurvey implements SodaSurveyInterface{
    
    private int[][] surveyData; // @keyterm, two-dimensional array

    /**
     * Creates a SodaSurvey from a file containing a 2-dimentional array
     * @param filename
     */
    public SodaSurvey(String filename){
        File file = new File(filename);
        try
        {
            Scanner lineScan = null;
            Scanner fileScan = new Scanner(file);
            String line = fileScan.next();
            lineScan = new Scanner(line);
            int row = Integer.parseInt(lineScan.next());
            int col = Integer.parseInt(lineScan.next());
            surveyData = new int[row][col];

            while(fileScan.hasNextLine())
            {
                for(row = 0; row < surveyData.length; row++) // @keyterm, row
                {
                    for(col = 0; col < surveyData[row].length; col++) // @keyterm, column
                    {
                        surveyData[row][col] = lineScan.nextInt();
                    }
                }
            }
            lineScan.close();
            fileScan.close();
        }
        catch(Exception filenotfoundException)
        {
            System.out.println("File not found!");
        }
    }

    public double rowAvg(int rowIndex){
        int rowSum = 0;
        int i;
        for(i = 0; i < surveyData[rowIndex].length; i++) // @keyterm, iterating over 2D array
        {
            rowSum = surveyData[rowIndex][i] + rowSum;
        }
        return (rowSum / surveyData[rowIndex].length);
    }

    public double colAvg(int colIndex){
        int colSum = 0;
        int j;
        for(j = 0; j < surveyData.length; j++)
        {
            colSum = surveyData[j][colIndex] + colSum;
        }
        return (colSum / surveyData.length);
    }

    @Override
    public String toString(){
        String string = " ";
        for(int row = 0; row < surveyData.length; ++row)
        {
            string += "Person " + row + " Mean: " + rowAvg(row);
        }
        System.out.println();
        for(int row = 0; row < surveyData.length; ++row)
        {
            for(int col = 0; col < surveyData[row].length; ++col)
            {
                string += "Soda " + col + " Mean: " + colAvg(col);
            }
        }
        return string;
    }

}
