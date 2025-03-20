
import java.util.Scanner;
 class A1{
  public static void main(String args[]){
 
 String s = "Welcome to bhopal";

 String arr[] = s.split(" ");

    for(int i = arr.length-1 ; i>=0 ; i--){

  
        System.out.print( arr[i] + " ");
    }

  }
}