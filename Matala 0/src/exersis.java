import java.sql.Array;

public class exersis {
    public static void main(String[] args ){
        int[] arr =  {8,1,5,2,3,7};
        int temp;
        for (int j = arr.length-1; j >0 ; j--)
            for(int i = 0; i < j; i++){
                if(arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
            }

        }
        System.out.println(arr);
    }
    public static void sort2(int[] arr){
        for (int i = 0; i < arr.length;);
    }
}
