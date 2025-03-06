public class printFact {
    
   
public static int  findFactorial(int n){

      if(n== 0){
      return 1;
      } 
    
  int fmn1 = findFactorial(n-1); 

  int res = n *findFactorial(n-1);
   
   return res; 
  
   }
    public static void main(String[] args) {
         
    int n = 5;  
    findFactorial(n);

    }
}
