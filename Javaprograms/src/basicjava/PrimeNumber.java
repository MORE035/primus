package basicjava;

import java.util.Scanner;

public class PrimeNumber {




     public static void main(String[] args) {
         
          int limit = 100;
          for (int i = limit; i >= 1; i--) {
               if (primes(i, i - 1) == 1) {
                    System.out.println(i + " is a prime no");
               } 
              
          }
     }

     private static int primes(int x, int i) {
          if (i == 1) {
               return 1;
          }
          try {
               if (x % i == 0) {
                    return 0;
               } else {
                    return primes(x, i - 1);
               }
          } catch (Exception e) {
               return 1;
          }
     }
}




