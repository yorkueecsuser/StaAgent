import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Comparator;

class UncallableMethodOfAnonymousClass {
  private static final Comparator COMPARATOR =
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          int result = o1.hashCode() - o2.hashCode();
          assert (result > 0);

          // Introduced unreachable while loop
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop");
          }

          return result;
        }
      };

  private class DepFactory {

    public Object getDep() {
      return new Object() {
        @NoWarning("IMA_INEFFICIENT_MEMBER_ACCESS")
        public UncallableMethodOfAnonymousClass getDepSetter() {
          return UncallableMethodOfAnonymousClass.this;
        }
      };
    }
  }

  // Method to provide a dynamic condition for the while loop
  private boolean getCondition() {
    return false; // This will ensure the loop is never entered at runtime
  }
}