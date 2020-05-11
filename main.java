class main{ 
      
    public static void main(String []args) { 
          //BOYER MOORE
         char txt[] = "ABAAABCD".toCharArray(); 
         char pat[] = "ABC".toCharArray(); 
         String kmptxt = "ABAAABCD";
         String kmppat = "ABC";
         
         BM.search(txt, pat); 
         KMP.KMPSearch(kmppat, kmptxt);
    } 
}  