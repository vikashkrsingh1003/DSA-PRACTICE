package tnp;
import java.util.Scanner;

public class unique {
    
  
    

  public static void main(String[] args) {
   
    int[] arr = {2,2,6,8,6};

    int unique = 0;

    for(int x :arr){
       unique ^= x;
    }
    System.out.println(unique);
  
   } 
}
