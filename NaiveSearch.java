// Java program for Naive Pattern Searching 
public class NaiveSearch { 
  
    public static void search(String txt, String pat) 
    { 
        int n = pat.length(); 
        int m = txt.length(); 
        
        int outerTime = 0;
        int innerTime = 0;
  
        /* A loop to slide pat one by one */
        for (int i = 0; i < m - n + 1; i++) { 
        	outerTime++;
            int j = 0;
  
            /* For current index i, check for pattern  
              match */
            while(j < n) {
            	innerTime++;
                	if (pat.charAt(j) != txt.charAt(i + j) ) {
                		break;
                	}
                	
                	j++;
                	
                	if(j == n) {
                		System.out.println("Pattern found at index " + i); 
                    	System.out.println(outerTime * innerTime);
                    	break;
                	}
                }  
            }
        } 
    }