public class Tester {
 public static void main(String args[]) {
   int[] check = {1, 2, 3, 4, 99};
   int[] expect = {3, 5, 7, 11, 541};
   for (int i = 0; i <= 4; i++) {
     if (nthPrime(check[i]) == expect[i])  
       {System.out.println("pass");}
       else {System.out.println("fail expected " + expect[i] + ", but value returned was  " + nthPrime(check[i
]));}
   }
 }
 public static boolean isPrime(int n) {
   for (int i = 2; i < n; i++) {
     if (n % i == 0) {return false;}
   }
   return true;
 }

 public static int nthPrime(int n) {
   int i = 2;
   while (n > 0) {
     i++;
     if (isPrime(i))  {n--;}
   }
   return i;
 }
}



