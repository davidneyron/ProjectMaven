package schoolproject;

import java.io.*;
import java.util.*;
import com.opencsv.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(max(4,5));
        
        int monmax=0;
        try {
        	CSVReader reader =  new CSVReader(new FileReader("data.csv"));
        	try {
        		List<String[]> myEntries = reader.readAll();
        		for (String[] s : myEntries) {
        			
        			System.out.println(Arrays.toString(s));
					for(String nb : s){
						//System.out.println("Nombre lu : "+ nb);
                		monmax = max(monmax, Integer.parseInt(nb));
					}
        		}
        		System.out.println("Mon max : " + monmax);
        		
        	}
        	catch (IOException e) {
        		System.out.println("standard message: IOE");
        	}
        }
        catch(FileNotFoundException e) {
        	System.out.println("standard message: FNFE");
        }
    }
    
    public static int max(int a, int b){
    	return a > b ? a : b;
    	//return a; //Le stagiaire est passe par la
    }
}
