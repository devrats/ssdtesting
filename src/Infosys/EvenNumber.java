/*   Created by IntelliJ IDEA.
 *   Author: Devvrat Sharma (devrats)
 *   Date: 28-Jan-22
 *   Time: 10:34 AM
 *   File: EvenNumber.java
 */

package Infosys;

import java.util.*;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        even(str);
    }

    public static void even(String str){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i);
            if(a>=48 && a<=57){
                set.add(Integer.parseInt(Character.toString(str.charAt(i))));
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>(set);;
        Collections.sort(arrayList);
        System.out.println(arrayList);
        if (arrayList.get(0) % 2 == 1) {
            int a = arrayList.remove(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i)%2==0){
                    int b = arrayList.remove(i);
                    arrayList.add(0,a);
                    arrayList.add(0,b);
                    break;
                }
            }
        }
        if (arrayList.get(0) % 2 == 1){
            System.out.println(-1);
        } else {
            for (int i = arrayList.size()-1; i >=0; i--) {
                System.out.print(arrayList.get(i));
            }
        }
        //System.out.println(Arrays.toString(arr));
    }
}