package toggleboolean;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(reverse(true));
  }

  public static boolean reverse(boolean b) {
    return !b;
  }
}