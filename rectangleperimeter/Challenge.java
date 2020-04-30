package rectangleperimeter;

public class Challenge {
  public static void main(String[] args) {
    System.out.println(findPerimeter(5, 7));
  }

  public static int findPerimeter(int height, int width) {
    return (2 * height) + (2 * width);
  }
}