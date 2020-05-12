package lessthanequaltozero;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(lessThanOrEqualToZero(5));
    System.out.println(lessThanOrEqualToZero(-5));
  }

  public static boolean lessThanOrEqualToZero(int num) {
    if (num <= 0)
      return true;
    else
      return false;
  }
}