import java.util.stream.Collectors;
import java.util.*;

import packages.BaseClass;
import java.util.stream.Stream;

public class App extends BaseClass {

  public static String sortStr(String str) {
    char[] strArr = str.toCharArray();
    Arrays.sort(strArr);
    return new String(strArr);
  }

  public static void main(String[] args) {

    String vowl = ".*[aeiou].*";

    String ss = "Sumit";
    isPrime(11);
  }

  public static boolean isPrime(int n) {
    if (n == 0 || n == 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    p(n / 2);
    for (int i = 2; i <= n / 2; i++) {

      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }

}