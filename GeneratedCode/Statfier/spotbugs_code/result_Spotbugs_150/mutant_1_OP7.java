import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
    return arg0.hashCode() - arg1.hashCode();
  }

  private boolean getCondition() {
    // This method returns false, making the while loop unreachable
    return false;
  }
}