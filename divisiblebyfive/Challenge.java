package divisiblebyfive;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(divisibleByFive(25));
  }

  public static boolean divisibleByFive(int num) {
    if (num % 5 == 0)
      return true;
    else
      return false;
  }
}