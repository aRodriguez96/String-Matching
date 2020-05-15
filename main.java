import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;
import java.util.Scanner;

class main{ 
      
    public static void main(String []args) throws FileNotFoundException { 
    	int n = 10;
    	
    	// Output string from file
    	String fileName = "src/10.txt";
    	String builder = readStringFromFile(fileName);
    	
    	System.out.println(builder);
    	
    	// The pattern to search
    	String pattern;
    	System.out.println("Enter a string pattern to find");
    	
    	Scanner scanner = new Scanner(System.in);
    	pattern = scanner.nextLine();
    	System.out.println();
		
		//BOYER MOORE
    	System.out.println("Boyer Moore");
		BM.search(builder.toCharArray(), pattern.toCharArray() ); 
		System.out.println();
		 
		// Knuth Morris Pratt Algo
		System.out.println("Knuth-Morris-Pratt");
		KMP.KMPSearch(pattern, builder);
		System.out.println();
		 
		// Rabin Karp
		System.out.println("Rabin Karp");
		int prime = 101;
		RK.search(pattern, builder, prime);
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