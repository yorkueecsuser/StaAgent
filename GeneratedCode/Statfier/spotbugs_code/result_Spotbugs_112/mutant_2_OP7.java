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

    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is always false
      System.out.println("This loop will never execute");
    }
    // }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}