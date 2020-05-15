import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

class main{ 
      
    public static void main(String []args) throws FileNotFoundException { 
        long startTime;
	    long stopTime;
	    long elapsedTime;
	 	int prime;
	 	String builder;
	 	String worstPattern;
	 	String avgPattern;
	 	String bestPattern;
    	
	 	/*
	 	 * 
	 	 * ~~~~~~~~ INPUT SIZE = 10
	 	 * 
	 	 */
	     System.out.println("~~~~~~~~~~~~~~~~~INPUT SIZE 10~~~~~~~~~~~~~~~~~");
    	// Output string from file
    	String fileName10 = "10.txt";
    	builder = readStringFromFile(fileName10);
    	
    	System.out.println("String: "+builder+"\n");
    	
    	// The pattern to search
    	worstPattern = "ef";
    	avgPattern = "le";
    	bestPattern = "xm";
		
		//BOYER MOORE
    	System.out.println("----Boyer Moore----");
    	System.out.println("Worst Case:");
    	startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), worstPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), avgPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();

		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), bestPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Knuth Morris Pratt Algo
		System.out.println("----Knuth-Morris-Pratt----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(worstPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(avgPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(bestPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Rabin Karp
		System.out.println("----Rabin Karp----");
		System.out.println("Worst Case: ");
		prime = 101;
		startTime = System.currentTimeMillis();
		RK.search(worstPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		RK.search(avgPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		RK.search(bestPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Naive
		System.out.println("----Naive Approach----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, worstPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, avgPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, bestPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		/*
	 	 * 
	 	 * ~~~~~~~~ INPUT SIZE = 100
	 	 * 
	 	 */
	     System.out.println("~~~~~~~~~~~~~~~~~INPUT SIZE 100~~~~~~~~~~~~~~~~~");
    	// Output string from file
    	String fileName100 = "100.txt";
    	builder = readStringFromFile(fileName100);
    	
    	System.out.println("String: "+builder+"\n");
    	
    	// The pattern to search
    	worstPattern = "hhggi";
    	avgPattern = "dcjqs";
    	bestPattern = "hhggi";
		
		//BOYER MOORE
    	System.out.println("----Boyer Moore----");
    	System.out.println("Worst Case:");
    	startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), worstPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), avgPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();

		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), bestPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Knuth Morris Pratt Algo
		System.out.println("----Knuth-Morris-Pratt----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(worstPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(avgPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(bestPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Rabin Karp
		System.out.println("----Rabin Karp----");
		System.out.println("Worst Case: ");
		prime = 101;
		startTime = System.currentTimeMillis();
		RK.search(worstPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		RK.search(avgPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		RK.search(bestPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Naive
		System.out.println("----Naive Approach----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, worstPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, avgPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, bestPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		/*
	 	 * 
	 	 * ~~~~~~~~ INPUT SIZE = 1000
	 	 * 
	 	 */
	     System.out.println("~~~~~~~~~~~~~~~~~INPUT SIZE 1000~~~~~~~~~~~~~~~~~");
    	// Output string from file
    	String fileName1000 = "1000.txt";
    	builder = readStringFromFile(fileName1000);
    	
    	System.out.println("String: "+builder+"\n");
    	
    	// The pattern to search
    	worstPattern = "hhggi";
    	avgPattern = "xqlboxdgeg";
    	bestPattern = "onofrgnpf";
		
		//BOYER MOORE
    	System.out.println("----Boyer Moore----");
    	System.out.println("Worst Case:");
    	startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), worstPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), avgPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();

		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), bestPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Knuth Morris Pratt Algo
		System.out.println("----Knuth-Morris-Pratt----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(worstPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(avgPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(bestPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Rabin Karp
		System.out.println("----Rabin Karp----");
		System.out.println("Worst Case: ");
		prime = 101;
		startTime = System.currentTimeMillis();
		RK.search(worstPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		RK.search(avgPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		RK.search(bestPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Naive
		System.out.println("----Naive Approach----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, worstPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, avgPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, bestPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		/*
	 	 * 
	 	 * ~~~~~~~~ INPUT SIZE = 1000
	 	 * 
	 	 */
	     System.out.println("~~~~~~~~~~~~~~~~~INPUT SIZE 10000~~~~~~~~~~~~~~~~~");
    	// Output string from file
    	String fileName10000 = "10000.txt";
    	builder = readStringFromFile(fileName10000);
    	
    	System.out.println("String: "+builder+"\n");
    	
    	// The pattern to search
    	worstPattern = "emspdhvtmcqmwnvcofg";
    	avgPattern = "ynzvjnsjfuyeevixueav";
    	bestPattern = "iupuelqarifmtijctjqon";
		
		//BOYER MOORE
    	System.out.println("----Boyer Moore----");
    	System.out.println("Worst Case:");
    	startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), worstPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), avgPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();

		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		BM.search(builder.toCharArray(), bestPattern.toCharArray() ); 
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Knuth Morris Pratt Algo
		System.out.println("----Knuth-Morris-Pratt----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(worstPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(avgPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		KMP.KMPSearch(bestPattern, builder);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Rabin Karp
		System.out.println("----Rabin Karp----");
		System.out.println("Worst Case: ");
		prime = 101;
		startTime = System.currentTimeMillis();
		RK.search(worstPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		RK.search(avgPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		RK.search(bestPattern, builder, prime);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
		
		// Naive
		System.out.println("----Naive Approach----");
		System.out.println("Worst Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, worstPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Avg Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, avgPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		
		System.out.println("Best Case: ");
		startTime = System.currentTimeMillis();
		NaiveSearch.search(builder, bestPattern);
		stopTime = System.currentTimeMillis();
		elapsedTime = stopTime - startTime;
		System.out.println("Elapsed Time in ms: "+elapsedTime);
		System.out.println("Total Comparisons: ");
		System.out.println();
		System.out.println();
    
    } 
    

    // Generates a new string, every 10th character is a new line for readability
    private static String generateString(int length) {
    	// alphabet to generate string
    	String alpha = "abcdefghijklmnopqrstuvwxyz";
    	String builder = new String();
    	
    	for(int i = 0; i < length; i++) {
    		Random r = new Random();
			
			int c = r.nextInt(alpha.length() );
		    builder += alpha.charAt(c);
		    
		    if(i % 10 == 0 && i != 0) {
		    	builder += "\n";
		    }
    	}
    	
    	return builder;
    }
    
    // Prints a string to a file
    private static void outputStringToFile(String input, String fileName) throws IOException {
    	OutputStreamWriter writer = new OutputStreamWriter(
				new FileOutputStream(fileName) );
    	
    	writer.write(input);
    	
    	writer.close();
    }
    
    // Build a string from file
    private static String readStringFromFile(String fileToRead) throws FileNotFoundException {
    	Scanner scanner = new Scanner(new File(fileToRead));
    	String content = new String();
    	
    	while(scanner.hasNext() ) {
    		content += scanner.next();
    	}
    	
    	return content.toString();
    }
}  