package lessthanonehundred;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(lessThan100(10, 95));
    System.out.println(lessThan100(10, 9));
  }

  public static boolean lessThan100(int a, int b) {
    if (a + b < 100)
      return true;
    else
      return false;
  }
}