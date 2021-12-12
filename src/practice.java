import java.util.*;
public class practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        int [] arr = new int[times];
        for(int i = 0; i<times;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        reverseArray(arr, arr.length-1);
    }

    public static void reverseArray(int [] arr, int i){
        if(i>=0){
            System.out.println(arr[i]);
            reverseArray(arr,i--);

        } else{
            return;
        }

    }
}
