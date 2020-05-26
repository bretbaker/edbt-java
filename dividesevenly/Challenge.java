package dividesevenly;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(dividesEvenly(20, 5));
  }

  public static boolean dividesEvenly(int a, int b) {
    if (a % b == 0)
      return true;
    else
      return false;
  }
}