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
    // }

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}