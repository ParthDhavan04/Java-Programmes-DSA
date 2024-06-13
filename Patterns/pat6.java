public class pat6 {
    
    public static void main(String[] args)
    {
        /*
         *
        **
       ***
      ****
     *****
         */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=1; i<=5; i++)
        {
            for(int s=(5-i); s>=0; s--){
                System.out.print(" ");
            }
            for(int j=1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    
    }
}
