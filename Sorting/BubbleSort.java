import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1,};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void bubble(int [] arr){

        boolean swap;

        for(int i=0; i<arr.length; i++)
        {
            //run the steps n-1 times
            swap = false;
            //for each step,max item will come at the last respective index
            for(int j=1; j<arr.length-i; j++){
                //swap if the item is smaller than the previous item
                if(arr[j] <arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swap = true;
                }
            }
        //if u did not swap for the particular value of i,it means the array is sorted so stop the program
        if(swap == false)
            break;
        
        }

    }
}
