package BackTracking;

public class stringSubset {
       
      public static void findSubset(String str, String ans, int i){

        //base case 
        if(i == str.length()){
            System.out.println(ans);
             return;
        }
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //No choice
        findSubset(str, ans, i+1);
      } 

public static void main(String[] args) {
    

    String str = "abcd";
    findSubset(str,"", 0);
 }
}
