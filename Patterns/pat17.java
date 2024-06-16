public class pat17 {

    public static void main(String[] args)
    {
    /*
         1
        212
       32123
      4321234
       32123
        212
         1
        
    */
        
        //rows i , columns j
        
        //change i, static j
        
        for(int i=1; i<=4; i++)
        {   
            for(int s=(5-i);s>=0;s--)//space is always rows - i, because i is values being printed 
            System.out.print(" ");
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            if(i>1){
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();

        }   
        for(int i=3; i>=1; i--)
        {   
            for(int s=(5-i);s>=0;s--)//space is always rows - i, because i is values being printed 
            System.out.print(" ");
            for(int j=i; j>=1; j--)
            {
                System.out.print(j);
            }
            if(i>1){
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            }
            System.out.println();

        }   


    }
    
}
