package tnp;
import java.util.ArrayList;
public class mergeList {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);

        ArrayList <Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(7);

        ArrayList<Integer> mergeList = new ArrayList<>(l1);
        mergeList.addAll(l2);

        System.out.println(mergeList);
    }
}
