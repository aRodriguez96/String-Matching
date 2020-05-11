class main{ 
      
    public static void main(String []args) { 
          //BOYER MOORE
         char txt[] = "ABAAABCD".toCharArray(); 
         char pat[] = "ABC".toCharArray(); 
         BM.search(txt, pat); 
         
         // Knuth Morris Pratt Algo
         String kmptxt = "ABAAABCD";
         String kmppat = "ABC";
         KMP.KMPSearch(kmppat, kmptxt);
         
         // Rabin Karp
         String rktxt = "SATEESH IS MY HOME DAWG";
         String rkpat = "HOM";
         int prime = 101;
         RK.search(rkpat, rktxt, prime);
    } 
}  