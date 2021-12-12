import java.util.*;
public class practice3 {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int face = sc.nextInt();
//        boardGame1(size,face,0,"");
        System.out.println(boardGame(size,face,0));
//        System.out.println(noways(0,3));
    }

    public static int boardGame(int size, int face, int distance){
        if(distance==size){
            return 1;
        }
        if(distance>size){
            return 0;
        }
        int a = 0;
        for(int i = 1 ; i<=face; i++){
            a+=boardGame(size,face,distance+i);
        }
        return a;
    }
//
//    public static void boardGame1(int size, int face, int distance, String str){
//        if(distance==size){
//            System.out.println(str);
//            return;
//        }
//        if(distance>size){
//            return;
//        }
//        for(int i = 1 ; i<=face; i++){
//            String sequence = Integer.toString(i);
//            str+=sequence;
//            boardGame1(size,face,distance+i,str);
//        }
//    }

//    public static int noways(int curr, int dis) {
//        if(curr==dis) {
//            return 1;
//        }
//        if(curr>dis) {
//            return 0;
//        }
//
////		int Steps1 = noways(curr + 1, dis);
////		int Steps2 = noways(curr + 2, dis);
////		int Steps3 = noways(curr + 3, dis);
//        int ans=0;
//        for (int step = 1; step <=3; step++) {
//            ans+=noways(curr+step, dis);
//
//        }
//        return ans;
//
//    }
}
