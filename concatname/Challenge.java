package concatname;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(concatName("Mary", "Jane"));
  }

  public static String concatName(String firstName, String lastName) {
    return firstName + ", " + lastName;
  }
}