package tnp;

import java.util.*;
public class p1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int n = Integer.toBinaryString(x).length();

        int mask = (1 << n)-1;

        int tN = x^mask;

        System.out.println(tN);
    }
}
