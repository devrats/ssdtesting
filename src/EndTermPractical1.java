/*Name - Anant Kumar
Roll Number - 24(191500109)
Section - C*/

import java.util.ArrayList;
import java.util.List;

public class EndTermPractical1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(1);
        System.out.println(removeDuplicate((ArrayList) list));

    }

    public static List removeDuplicate(ArrayList list){
        List nonDuplicateList = new ArrayList();
        for (int i = 0;i<list.size();i++) {
            if(nonDuplicateList.contains(list.get(i))){
                continue;
            } else {
                nonDuplicateList.add(list.get(i));
            }
        }
        return nonDuplicateList;
    }
}