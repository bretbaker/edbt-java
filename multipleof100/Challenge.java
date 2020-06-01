package multipleof100;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(divisible(999));
  }

  public static boolean divisible(int num) {
    if (num % 100 == 0) {
      return true;
    } else {
      return false;
    }
  }
}