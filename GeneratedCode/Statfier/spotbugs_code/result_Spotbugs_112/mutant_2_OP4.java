import java.util.Random;

class Failure {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Random x = new Random();
    // for (int y=0; y<50;y++)
    // {
    int choice = x.nextInt();
    choice = choice % 2;
    System.out.println(choice);

    // Introduced unreachable if-else statement
    boolean shouldRun = false; // This variable ensures the if-else is unreachable but not a compile-time constant
    if (shouldRun) {
      System.out.println("This will never be printed because shouldRun is false.");
    } else {
      System.out.println("This will also never be printed because shouldRun is false.");
    }
    // }
  }
}