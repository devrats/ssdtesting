import java.util.*;
public class Practice4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i = 0 ; i<testCase;i++){
            String s = sc.nextLine();
            System.out.println(s);
            while(true){
                if(s.contains("pi")){
                    s.replace("pi","3.14");
                } else{
                    break;
                }
            }
            System.out.println(s);
        }
    }
}