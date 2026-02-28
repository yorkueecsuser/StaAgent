import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Comparator;

class UncallableMethodOfAnonymousClass {
  private static final Comparator COMPARATOR =
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          int result = o1.hashCode() - o2.hashCode();
          assert (result > 0);

          // Introduced unreachable if statement
          boolean condition = getCondition();
          if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable statement.");
          }

          return result;
        }

        private boolean getCondition() {
          return false;
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
}