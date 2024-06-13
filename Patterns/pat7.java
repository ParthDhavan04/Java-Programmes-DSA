public class pat7 {
    
    public static void main(String[] args)
    {
        /*
     *****
      ****
       ***
        **
         *
         */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=5; i>=1; i--)
        {
            for(int s=(5-i); s>=0; s--){
                System.out.print(" ");
            }
            for(int j=i; j>= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    
    }
}
