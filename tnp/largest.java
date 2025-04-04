package tnp;

import java.util.ArrayList;

public class largest {


    
    public static int largestNumber(ArrayList<Integer> list){

        int max = Integer.MIN_VALUE;

        for(int i=0; i<list.size();i++){
            if(list.get(i)> max){
        
              max= list.get(i);
            }  
        }return max;
        
    } 

    public static int smallestNumber(ArrayList<Integer> list){

        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<list.size();i++){
            if(list.get(i) < min){
        
              min= list.get(i);
            }  
        }return min;


    }

    
     public static void main(String[] args) {

    
    ArrayList<Integer> list = new ArrayList<>();

    list.add(2);
    list.add(5);
    list.add(9);
    list.add(1);
    list.add(10);

   
    System.out.println(largestNumber(list));
    System.out.println(smallestNumber(list));
    }
}
