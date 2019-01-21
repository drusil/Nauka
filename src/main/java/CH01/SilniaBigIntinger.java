package CH01;

import java.math.BigInteger;

public class SilniaBigIntinger {
  public static void main(String[] args) {
    System.out.println(silnia(1));
    System.out.println(silnia(2));
    System.out.println(silnia(3));
    System.out.println(silnia(4));
    System.out.println(silnia(5));
    System.out.println(silnia(1000));
  }

  public static BigInteger silnia(int number) {
    if (number <= 1) {
      return BigInteger.ONE;
    }
    else {
      BigInteger value = BigInteger.ONE;
      for (int i = 2; i <=number ; i++) {
        value = BigInteger.valueOf((long) i).multiply(value);
      }
      return value;
    }
  }
}
