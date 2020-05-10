class main{ 
      
    public static void main(String []args) { 
          //BOYER MOORE
         char txt[] = "ABAAABCD".toCharArray(); 
         char pat[] = "ABC".toCharArray(); 
         BM.search(txt, pat); 
    } 
}  