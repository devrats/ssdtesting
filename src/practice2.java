import java.util.*;
public class practice2 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int [] arr = new int[times];
        for(int i = 0; i<times;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        int element = sc.nextInt();
        lastIndex(arr, element , arr.length-1);
    }

    public static void lastIndex(int[] arr, int element, int place){
        if(element==arr[place]){
            System.out.println(place);
            return;
        } else if(place>=0){
            lastIndex(arr, element, place-1);
        } else{
            return;
        }
    }
}
