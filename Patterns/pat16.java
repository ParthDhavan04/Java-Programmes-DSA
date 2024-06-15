public class pat16 {

    public static void main(String[] args)
    {
        /*
     *
    ***
   *****
  *******
 *********
        
        */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=1; i<=4; i++)
        {   
            for(int s=(5-i);s>=0;s--)//space is always rows - i, because i is values being printed 
            System.out.print(" ");
            for(int j=i; j>=1; j--)
            {
                System.out.print(Math.pow(11,i));
            }
            System.out.println();

        }   

    }
    
}
