package equalint;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(isEqual(8, 7));
  }

  public static boolean isEqual(int num1, int num2) {
    if (num1 == num2)
      return true;
    else
      return false;
  }
}