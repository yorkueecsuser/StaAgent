import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      System.out.println("This is an unreachable statement.");
    }

    return arg0.hashCode() - arg1.hashCode();
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the if block is unreachable
    return false;
  }
}