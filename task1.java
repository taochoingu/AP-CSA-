import java.util.*;

public class Hailstone {
  public static int hailstoneLength(int n){
    int count = 1;
    while (n!=1){
      if (n%2 == 0){ n /= 2;count++;}
      else {n=3*n+1;count++;}
    }
    return count;
}
  public static boolean isLongSeq(int n){
    if (n < hailstoneLength(n)) return true;
    else return false;
  } 
  public static double propLong(int n){
      int count = 0;
      for (int i = 1; i<= n;i++){
        if (isLongSeq(i)) count++;
      }
      return (double) count/n;
  }
}
