package strlengthmatch;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(comp("tt", "yy"));
  }

  public static boolean comp(String str1, String str2) {
    if (str1.length() == str2.length()) {
      return true;
    } else {
      return false;
    }
  }
}