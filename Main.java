/*
 * Name: Justin Senia
 * E-Number: E00851822
 * Date: 3/30/2017
 * Class: COSC 314
 * Project: #3, Part 1
 */

import java.util.*;
import java.io.*;

public class Main {
    
	//declaring variable "n" to be used to keep current graph's number of vertices
    static int n;
	//declaring variable "v" to be used to keep current graph's number of edges
	static int gEdges;
	//declaring global matrix to hold graph connection information
	static int[][] gMatrix;
	//declaring global coloring array for graph coloration
	static int[] gColorArray;
	//declaring & initializing chromatic number variable for later storage
	static int chromNumber = 0;
	//declaring and initializing variable to keep track of whether or not a specific chromatic #
	//will be searched for, or if an aproxximated range will be sought instead
	static boolean runTimer = false;
	//declaring and initializing variable to determine printing format for data 
	//(false: single chromatic number, true:chromatic range approx.
	static boolean rTPrintSwitch = false;
	//declaring and initializing variables to keep track of low and high end potential
	//chromatic numbers for the current data set.
	static int chromPotenMin = 0;
	static int chromPotenMax = 0;
	

	
    //main method for Project 3
    public static void main(String[] args) throws IOException{
        
        //FOR COSC 314 PROJECT #3, PART: 1
        //creating file locations to be used to locate external files and also
        //creating a location for the output file to be saved to.
        File inFileOne = new File("file1.txt"); 
        File inFileTwo = new File("file2.txt"); 
		File inFileThree = new File("file3.txt"); 
        File inFileFour = new File("file4.txt"); 
		File inFileFive = new File("file5.txt"); 
		File inFileTest = new File("fileTest.txt"); 

		File outFile = new File("OutputFile.txt");    
		//creating a printwriter for the output file
		//(passed: outFile= out file location to be saved)
		PrintWriter pWriter = new PrintWriter(outFile);
       
	   	//Label at top of output
		pWriter.println("   Class: COSC 314"); 
		pWriter.println("Project#: 3, Part 1");
		pWriter.println("    Name: Justin Senia");
		pWriter.println("      E#: E00851822");
	   
	   
	   
        //scanner created for file external reading
        Scanner fIn = new Scanner(inFileOne); 
     
        //read number of graph vertices from file
		n = fIn.nextInt();
		//read number of edges from file
        gEdges = fIn.nextInt();
		
        //create & populate matrix with external file data
        //(passed: n= size, fIn= scanner linked to external file)
        gMatrix = popFileMatrix(fIn);
		//creating array to store color values, all elements assigned value of 0
		gColorArray = popArray();
		
		//invokes coloring method to determine chromatic number of a given graph
		chromNumber = color(pWriter);

		//if color method found actual chromatic number: then print that number and the
		//associated coloring. if color method only found an approximation of chromatic number:
		//print the potential chromatic range and colored graph with smallest discovered chromatic value
		if (rTPrintSwitch == false)
			printGraphColors(pWriter, chromNumber, true, "file1.txt");
		else if (rTPrintSwitch == true)
			printGraphColors(pWriter, chromNumber, false, "file1.txt");
	
        //closing scanner to ready for next iteration
        fIn.close();
		
		
		//scanner created for file external reading
        fIn = new Scanner(inFileTwo); 
     
        //read number of graph vertices from file
		n = fIn.nextInt();
		//read number of edges from file
        gEdges = fIn.nextInt();
		
        //create & populate matrix with external file data
        //(passed: n= size, fIn= scanner linked to external file)
        gMatrix = popFileMatrix(fIn);
		//creating array to store color values, all elements assigned value of 0
		gColorArray = popArray();
		
		//invokes coloring method to determine chromatic number of a given graph
		chromNumber = color(pWriter);

		//if color method found actual chromatic number: then print that number and the
		//associated coloring. if color method only found an approximation of chromatic number:
		//print the potential chromatic range and colored graph with smallest discovered chromatic value
		if (rTPrintSwitch == false)
			printGraphColors(pWriter, chromNumber, true, "file2.txt");
		else if (rTPrintSwitch == true)
			printGraphColors(pWriter, chromNumber, false, "file2.txt");
		
        //closing scanner to ready for next iteration
        fIn.close();
		
		
		//scanner created for file external reading
        fIn = new Scanner(inFileThree); 
     
        //read number of graph vertices from file
		n = fIn.nextInt();
		//read number of edges from file
        gEdges = fIn.nextInt();
		
        //create & populate matrix with external file data
        //(passed: n= size, fIn= scanner linked to external file)
        gMatrix = popFileMatrix(fIn);
		//creating array to store color values, all elements assigned value of 0
		gColorArray = popArray();
		
		//invokes coloring method to determine chromatic number of a given graph
		chromNumber = color(pWriter);

		//if color method found actual chromatic number: then print that number and the
		//associated coloring. if color method only found an approximation of chromatic number:
		//print the potential chromatic range and colored graph with smallest discovered chromatic value
		if (rTPrintSwitch == false)
			printGraphColors(pWriter, chromNumber, true, "file3.txt");
		else if (rTPrintSwitch == true)
			printGraphColors(pWriter, chromNumber, false, "file3.txt");
		
        //closing scanner to ready for next iteration
        fIn.close();
		
		
		//scanner created for file external reading
        fIn = new Scanner(inFileFour); 
     
        //read number of graph vertices from file
		n = fIn.nextInt();
		//read number of edges from file
        gEdges = fIn.nextInt();
		
        //create & populate matrix with external file data
        //(passed: n= size, fIn= scanner linked to external file)
        gMatrix = popFileMatrix(fIn);
		//creating array to store color values, all elements assigned value of 0
		gColorArray = popArray();
		
		//invokes coloring method to determine chromatic number of a given graph
		chromNumber = color(pWriter);

		//if color method found actual chromatic number: then print that number and the
		//associated coloring. if color method only found an approximation of chromatic number:
		//print the potential chromatic range and colored graph with smallest discovered chromatic value
		if (rTPrintSwitch == false)
			printGraphColors(pWriter, chromNumber, true, "file4.txt");
		else if (rTPrintSwitch == true)
			printGraphColors(pWriter, chromNumber, false, "file4.txt");
		
        //closing scanner to ready for next iteration
        fIn.close();
		
		
		//scanner created for file external reading
        fIn = new Scanner(inFileFive); 
     
        //read number of graph vertices from file
		n = fIn.nextInt();
		//read number of edges from file
        gEdges = fIn.nextInt();
		
        //create & populate matrix with external file data
        //(passed: n= size, fIn= scanner linked to external file)
        gMatrix = popFileMatrix(fIn);
		//creating array to store color values, all elements assigned value of 0
		gColorArray = popArray();
		
		//invokes coloring method to determine chromatic number of a given graph
		chromNumber = color(pWriter);

		//if color method found actual chromatic number: then print that number and the
		//associated coloring. if color method only found an approximation of chromatic number:
		//print the potential chromatic range and colored graph with smallest discovered chromatic value
		if (rTPrintSwitch == false)
			printGraphColors(pWriter, chromNumber, true, "file5.txt");
		else if (rTPrintSwitch == true)
			printGraphColors(pWriter, chromNumber, false, "file5.txt");
		
        //closing scanner to maintain data integrity
        fIn.close();  
		
		
		//closing printwriter to maintain data integrity
        pWriter.close();
    }
    
	
	
	
	//colors G using minimum number of colors, returns chromatic number
	//if file takes an hour or longer to process, an approximate chromatic number range (within 10 values)
	//is sought instead and the graph will be colored with the minimum verified chromatic value
	//(passed: pWriter= print writer for printing output to external file
	public static int color(PrintWriter pWriter)
	{
		//resetting all external variables to default values to ensure calculated data is not
		//effected by pre-existing metrics, used so method can be re-used
		runTimer = false;
		rTPrintSwitch = false;
		chromPotenMin = 0;
		chromPotenMax = 0;
		
		//making note of start time in milliseconds so elapsed time processing current file
		//can be calculated accordingly
		long startingTime = System.currentTimeMillis();
		
		//outputting description in console for viewing runtime progress
		System.out.println("\n*****************************************************************************************");
		System.out.printf( "*** %3d Vertices (the number of colors tried will be shown below to display progress) ***%n", n);
		System.out.println("*****************************************************************************************\n");
		
		
		//iterates through potential number of color values to try and find the chromatic # using recursion
		for (int e = 1; e <= n; e++)
		{
			//prints attempted chromatic numbers in an orderly fashion so user can observe algorithm progress
			if (e%10 == 0)
				System.out.printf("%3d%n", e);
			else
				System.out.printf("%3d ", e);

			//if statement to always run coloring method with each incremented chromatic # possibility
			//calls method that recursively determines if a supplied # will work as the chromatic number
			//and returns that number if it will work, if it takes over an hour, it will switch over to
			//approximating the chromatic number instead.
			if (true){
				
				//calling color function to determine if the supplied number will work as a chromatic #
				if (color(0, e, startingTime) == true){
					System.out.println("");
					return e;
				}
			}
			
			//if loop has been active for over an hour, assign current for-loop value to lowest potential 
			//chromatic # variable and exit for-loop so that chromatic # approximation may begin
			if (runTimer == true){
				System.out.printf("%n*** Chromatic # approximation initiated due to time constraints ***%n");
				chromPotenMin = e;
				break;
			}
		}
		
		
		//prints active step in console so user can keep track of progress
		System.out.printf("%n*** narrowing potential range for chromatic # by working from highest # of colors to lowest ***%n");
		
		
		//runs loop with max potential chromatic colors and works it's way down to establish the highest end of the range
		if (runTimer == true){
			
			//reset color array for re-use
			gColorArray = popArray();
			
			//for loop iterates from max # used in potential chromatic color down to smaller values 
			for (int w = n; w > 0; w--){
				
				//prints attempted chromatic numbers in an orderly fashion so user can observe algorithm progress
				if (w-1%10 == 0)
					System.out.printf("%3d%n", w);
				else
					System.out.printf("%3d ", w);
				
				//repeatedly calls the color method to establish high end of potential chromatic # values
				if (color(0, w, System.currentTimeMillis()) == false){
					return w-1;
				}
				
				//if high end potential chromatic # value gets within 10 digits of the lowest potential minimum chromatic # value,
				//assign that value to chromPotenMax variable for later use and break the loop.
				if (w <= chromPotenMin + 9){
					chromPotenMax = w;
					break;
				}
			}
		}
		
		//resetting color array with zeroed out values
		gColorArray = popArray();
		
		//change printing switch to true, will let printing method know to print in "range" format, not specific chromatic # format
		rTPrintSwitch = true;
		
		//System output to let user know whats happening
		System.out.printf("%n*** Graph coloring initiated with minimum verified chromatic # from tested range ***%n");
		
		//Coloring graph using lowest verified working chromatic number value (range = lowest possible chromatic # + 10)
		color(0, chromPotenMax, System.currentTimeMillis());
		
		//return lowest verified working chromatic number value
		return chromPotenMax;
	}
	
	
	
	//colors G using m # of colors starting at user specified vertex recursively, returns a boolean
	//(passed: v= starting vertex value, m= current possible chromatic # being tested)
	//(passed(cont): strtTime= previously calculated start time used to determine cutof timer)
	public static boolean color(int v, int m, long strtTime)
	{

		//Base Case: if current vertex # is greater than "# of vertices -1", 
		//all vertices have been successfully colored, return true
		if (v > n - 1)
			return true;
		
		//if method hasn't run out of options and failed yet or succeeded, recursively call itself
		//to color remaining vertices
		else{
			
			//iterates through possible colors per this particular vertex
			for (int i = 1; i <= m; i++)
			{
				
				//if time since current file has started processing has met or exceeded 1 hour,
				//set runTimer flag to true, so chromatic # approximation can begin and
				//break out of for-loop to return to calling method. 
				if (timerSwitchMethod(strtTime) == true){
					runTimer = true;
					return false;
				}
				
				//assign current color to vertex
				gColorArray[v] = i;
				
				//sends vertex and coloring info to method to determine if it's legal to color in that way
				//if it is valid, recursively call this method again to continue to color the rest of the
				//graph by increasing the vertex label by +1					
				if (colorValid(v) == true)
				{	
					if (color (v+1, m, strtTime) == true)
						return true;
				}

				//if color was invalid, loop will try the next color value using next for-loop iteration as value
			}
			
			//if all colors were invalid, assign color "0" to current vertex and return false so next
			//potential chromatic # can be tried in calling method
			gColorArray[v] = 0;
			return false;
		}
	}



	//method for determining if coloration is ok or violates coloring rules, returns a boolean
	//(passed: cVert= current vertex (used as a row coordinate)
	public static boolean colorValid(int cVert){
		
		//for loop controls horizontal movement through adjacency matrix
		for (int r = 0; r < n; r++){
			
			//whenever there exists a connection on the current row of the adjacency matrix being checked,
			//the color value will be checked at both vertices in the color array to make sure they don't
			//match, if they do match, it violates the coloring rules and will return false
			//if (cVert == r){;}
			if (gMatrix[cVert][r] == 1 && gColorArray[cVert] == gColorArray[r])
					return false;
		}
		
		//if there are no conflicts, return true
		return true;
	}

	
	
	//creates and returns a zeroed out array of a specified size
    public static int[] popArray(){
		
		//creating int array of user specified size
		int[] zeroArray = new int[n];
		
		//filling created array with "0" values
		for (int y = 0; y < n; y++){
			zeroArray[y] = 0;
		}
		
		//returning new zeroed out array
		return zeroArray;
	}
	
    
    
    //creates a matrix populated by all zero's based on current "n" value (# of verts), returns created matrix
    public static int[][] popMatrix(){
        
        //create new matrix based on input param size
        int[][] zeroMatrix = new int[n][n];

			//populate new matrix with all zero's
			for (int t = 0; t < n; t++){
				
				for (int y = 0; y < n; y++){
					zeroMatrix[t][y] = 0;
				}
			}
		
        //returns new matrix filled with all zero's
        return zeroMatrix;
    }
    
    
	
    //Makes a new matrix based off of properly formatted external file input, returns matrix
    //(passed: nPopFile= matrix dimension size based on external file
    //(passed(cont): keyInF = Scanner with file location attached to it)
    public static int[][] popFileMatrix(Scanner keyInF){
        
		int y;
		int x;
		
        //create new empty adjacency matrix based on read size in external file
        int[][] fileMatrix = popMatrix();
        
        //copies all external file values to comparable size matrix, since graphs supplied are non directional
		//a 1 is added to the adjacency matrix at coordinates (x, y) and then again at (y, x)
        for (int d = 0; d < gEdges; d++){
			y = keyInF.nextInt() - 1;
			x = keyInF.nextInt() - 1;
			fileMatrix[x][y] = 1;
			fileMatrix[y][x] = 1;
        }
        
        //returns file populated matrix
        return fileMatrix;
    }
    
    
	
	//prints colorized graph information
	//(passed: pW= printwriter, cNum= chromatic #, chFound=changes printing format based on results
	//(passed(cont): headerLabel= the name of the most recent file used for input
	public static void printGraphColors(PrintWriter pW, int cNum, boolean chFound, String headerLabel){
		
		//prints name of input file being used to calculate output
		pW.println("*********************************");
		pW.printf("* %18s            *%n", headerLabel);  
		
		//if method has found the actual chromatic number, output is formatted accordingly
		if (chFound == true){
			pW.printf("*       Chromatic #: %3d        *%n", cNum);
			pW.println("*********************************");
		}
		//if method had to search a range instead of finding the chromatic number, 
		//output is formatted accordingly
		else if (chFound == false){
			pW.printf("*   %3d  <= Chromatic # <= %3d   * %n", chromPotenMin, chromPotenMax);
			pW.println("*********************************");
		}
		
		//labels for vertex and color output information
		pW.println("*    Vertex     *     Color     *");  
		pW.println("*********************************");
		
		for (int g = 0; g < n; g++){
			pW.printf("%9d %15d %n", g+1, gColorArray[g]);
		}
		
		//printing a spacer so next printed iterations will be in a format easier to read
		pW.printf("%n%n%n");
	}
    

    
    //Method that is used to determine if an hour has passed from the spullied start time
	//used to detect if specific chromatic # should be sought or a range instead
	//returns a boolean "true" if runtime has met or exceeded 1 hour (3600000 milliseconds)
	//returns a false if runtime is less than 1 hour
    //passed: startTime= supplied start time used to determine current runtime)
    public static boolean timerSwitchMethod(long startTime){
        
        //makes note of current time
        long currentTime = System.currentTimeMillis();
		
		//calculates time elapsed  since the start time supplied by passed parameter 
        long elapsedTime = currentTime - startTime;
		
		//if elapsed time is over 1 hour (3600000 milliseconds) return true
		if (elapsedTime >= 3600000)
			return true;
		//otherwise return false
		else
			return false;
    }
}