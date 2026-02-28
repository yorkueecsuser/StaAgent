import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some unreachable code
      System.out.println("This is unreachable code.");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable code.");
    }
    return arg0.hashCode() - arg1.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else branches unreachable
    return false;
  }
}