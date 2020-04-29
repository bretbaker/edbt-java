package hourstoseconds;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(hoursToSeconds(7));
  }

  public static int hoursToSeconds(int hours) {
    return hours * 3600;
  }
}