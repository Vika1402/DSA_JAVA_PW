// // public class SumDigit {
// //   public static int sumDigit(int n){
// // if(n==0){
// //   return n;
// // }
// // return (n%10)+sumDigit(n/10);
// //   }
// //   public static void main(String[] args) {
// //     int n=12345;
// //     System.out.println(sumDigit(n));
// //   }
// // }

// /**
//  * SumDigit
//  */
// public class SumDigit {

//   public static void main(String[] args) {
//     int n = 12345;
//     int sum = 0;
//     while (n > 0) {
//       int lastDigit = n % 10;
//       sum = lastDigit + sum*10;
//      n=n/10;

//     }
//     System.out.println(sum);
//   }
// }

/**
 * SumDigit
 */
public class SumDigit {
public static void solve(int n,int k){{
  if(k==1){
    System.out.println(n);
    return;
  }
 solve(n, k-1);
  System.out.println(n*k);
}

}
  public static void main(String[] args) {
    solve(24, 5);
  }
}