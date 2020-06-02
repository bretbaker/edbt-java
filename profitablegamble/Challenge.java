package profitablegamble;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(profitableGamble(3, 6, 9));
  }

  public static boolean profitableGamble(double prob, double prize, double pay) {
    if ((prob * prize) > pay) {
      return true;
    } else {
      return false;
    }
  }
}