
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

  public static void main(String args[]) {

    // int n = 10;
    // printNum(n);

    int m =1;
    printInc(m);
  }

}