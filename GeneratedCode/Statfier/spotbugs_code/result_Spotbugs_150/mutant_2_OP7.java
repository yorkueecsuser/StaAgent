import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() will return false
    }

    return arg0.hashCode() - arg1.hashCode();
  }

  private boolean getCondition() {
    // This method returns false, making the while loop unreachable
    return false;
  }
}