import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Comparator;

class UncallableMethodOfAnonymousClass {
  private static final Comparator COMPARATOR =
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          int result = o1.hashCode() - o2.hashCode();
          assert (result > 0);
          
          // Mutant: Inserting an unreachable if-else statement
          boolean condition = getCondition();
          if (condition) {
            // This block will never execute because condition is always false
            result = 0;
          } else {
            // This block will always execute
            result = result;
          }
          
          return result;
        }
        
        // Method to provide a dynamic condition
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