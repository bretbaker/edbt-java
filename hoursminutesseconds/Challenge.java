package hoursminutesseconds;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(convert(5, 30));
  }

  public static int convert(int hours, int minutes) {
    return (hours * 3600) + (minutes * 60);
  }
}