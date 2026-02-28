import java.util.Comparator;

class Comparador implements Comparator {

  /**
   * @param args
   */
  public static void main(String[] args) {}

  @Override
  public int compare(Object arg0, Object arg1) {
    return arg0.hashCode() - arg1.hashCode();

    // Introduced unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 0 : 1) {
      case 0:
        // This case is unreachable because alwaysFalse is set to false
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is always executed
        System.out.println("This will always be printed");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}