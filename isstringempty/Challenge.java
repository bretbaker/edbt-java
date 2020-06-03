package isstringempty;

public class Challenge {

  public static void main(String[] args) {
    System.out.println(isEmpty(""));
  }

  public static boolean isEmpty(String str) {
    if (str == "") {
      return true;
    } else {
      return false;
    }
  }
}