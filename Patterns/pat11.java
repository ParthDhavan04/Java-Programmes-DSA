public class pat11 {
    
    public static void main(String[] args)
    {
        /*
     * * * * *
      * * * *
       * * *
        * *
         *
         */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=5; i>=1; i--)
        {   
            for(int s=(5-i);s>=0;s--)//space is always rows - i, because i is values being printed 
            System.out.print(" ");
            for(int j=i; j>= 1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    
    }
}