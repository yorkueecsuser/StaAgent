import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }

    return arg0.hashCode() - arg1.hashCode();
  }

  private boolean getCondition() {
    // This method returns false, making the for loop unreachable
    return false;
  }
}