package tnp;

public class swapAltenate {
    
public static void swap(int arr[]){
    int n = arr.length;

    for(int i=0; i<n ; i=i+2){

        if(i+1 < n){
         int temp = arr[i];
         arr[i] = arr[i+1];
         arr[i+1] = temp;
        }
    }
}
    public static void main(String[] args) {
        int arr[] = {5,7,2,9,2,4,8};
       swap(arr);
       for(int x : arr){
        System.out.print(" " +x);
       }
      
    }
}
