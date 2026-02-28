import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Comparator;

class UncallableMethodOfAnonymousClass {
  private static final Comparator COMPARATOR =
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          int result = o1.hashCode() - o2.hashCode();
          assert (result > 0);
          
          // Inserting an unreachable switch statement
          boolean condition = getCondition();
          switch (condition? 0 : 1) {
            case 0:
              // This case will never be executed because condition is always false
              result = -1;
              break;
            default:
              // Default case will also never be executed
              result = 1;
              break;
          }
          
          return result;
        }
        
        private boolean getCondition() {
          // This method always returns false, making the switch statement unreachable
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