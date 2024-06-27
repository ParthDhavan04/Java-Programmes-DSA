public class pat26 {
    public static void main(String[] args) {
        /*
      1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6 */ 
        

        int k=0;

        for(int i=6;i>=1;i--){

            for(int j=i;j>=1;j--){
                System.out.print(7-i);
            }
            System.out.println();
        }
    }
    
}
