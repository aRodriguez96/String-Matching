class main{ 
      
    public static void main(String []args) { 
          //BOYER MOORE
         System.out.println("Boyer");
    	 char txt[] = "ABAAABCD".toCharArray(); 
         char pat[] = "ABC".toCharArray(); 
         BM.search(txt, pat); 
         System.out.println();
         
         // Knuth Morris Pratt Algo
         System.out.println("KMP");
         String kmptxt = "ABAAABCD";
         String kmppat = "ABC";
         KMP.KMPSearch(kmppat, kmptxt);
         System.out.println();
         
         // Rabin Karp
         System.out.println("RK");
         String rktxt = "SATEESH IS MY HOME DAWG";
         String rkpat = "HOM";
         int prime = 101;
         RK.search(rkpat, rktxt, prime);
         System.out.println();
       
         //Naive
         System.out.println("naive");
         String txt2 = "AABAACAADAABAAABAA"; 
         String pat2 = "AABA"; 
         NaiveSearch.search(txt2, pat2); 
         System.out.println();
    } 
}  