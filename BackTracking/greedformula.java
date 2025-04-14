public class greedformula {

      // Function to calculate factorial
      public static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
        public static long gridWays(int n , int m){

            return factorial(m-1 + n-1) / (factorial(m-1) * factorial(n-1));
        }

        public static void main(String[] args) {
            
            int n = 3 , m=3;
          
            System.out.println(gridWays(n, m));
    
        }
    
}
