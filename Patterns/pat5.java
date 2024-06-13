public class pat5 {
    public static void main(String[] args)
    {
        /*
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *
         */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=1; i<=5; i++)
        {
            for(int j=1; j<= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=4; i>=1; i--)
        {
            for(int j=i; j>= 1; j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
