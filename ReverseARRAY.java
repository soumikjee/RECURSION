import java.util.Arrays;

public class ReverseARRAY {

    public static void main(String[]args){

        int [] arr = {10,20,30,40,50};

        rev(arr,0,arr.length-1);

       System.out.println(Arrays.toString(arr));
    }

    public static void rev(int [] arr , int first, int last){

        if(first==last){
            return;
        }

        int temp= arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
       
        rev (arr,first+1 ,last-1);
    }
    
}
