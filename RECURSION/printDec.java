
public class printDec {

  public static void printNum(int n) {

    if (n == 0) {
      //System.out.println(n);
      return;
    }
    System.out.print("==>" + n + " ");
    printNum(n - 1);
  }

  public static void printInc(int m) {

    if (m == 11) {
      //System.out.println(n);
      return;
    }
   
    System.out.print("==>" + m + " ");
    printInc(m + 1);
  }


  public static int  findFactorial(int n){

    if(n== 0){
    return 1;
    } 
  
  int f = findFactorial(n-1); 

int res = n *findFactorial(n-1);
 
 return res; 

 }

    public static int naturalSum(int n){

      if(n==1){
        return 1;
      }
      int snm1 =  naturalSum(n-1);
      int r = n+ snm1;

      return r;
    }
  public static void main(String args[]) {

    // int n = 10;
    // printNum(n);

    // int m =1;
    // printInc(m);

    int n=5;
    // findFactorial(n);
    // System.out.println( findFactorial(5));

    System.out.println(naturalSum(5));
  }

}