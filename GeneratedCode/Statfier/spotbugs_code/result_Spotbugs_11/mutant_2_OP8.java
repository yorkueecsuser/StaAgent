import edu.umd.cs.findbugs.annotations.NoWarning;
import java.util.Comparator;

class UncallableMethodOfAnonymousClass {
  private static final Comparator COMPARATOR =
      new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
          int result = o1.hashCode() - o2.hashCode();
          assert (result > 0);
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

  // Mutated code
  private static final Comparator comparatorx =
      new Comparator() {
        @Override
        public int compare(Object x, Object y) {
          int resultr = x.hashCode() - y.hashCode();
          assert (resultr > 0);
          return resultr;
        }
      };

  private class DepFactoryx {

    public Object getDepx() {
      return new Object() {
        @NoWarning("IMA_INEFFICIENT_MEMBER_ACCESS")
        public UncallableMethodOfAnonymousClass getDepSetterx() {
          return UncallableMethodOfAnonymousClass.this;
        }
      };
    }
  }
}