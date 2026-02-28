import java.util.Set;

class NullDeref6 {

  // from code in commons-collection,
  // org.apache.commons.collections.IteratorUtils.getIterator

  Object foo(Object o) {
    if (o == null) return o;

    if (o instanceof String) return o;

    // we should flag the o!= null test as redundant
    if (o!= null && o instanceof Set) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return ((Set) o).iterator();
    }

    // no warning should be generated here
    return o.getClass();
  }

  Object bar(Object o) {
    if (o!= null) return o;

    if (o == null) System.out.println("Got null");

    // Should get high priority
    System.out.println(o.hashCode());

    if (o == null) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return o;
    }
    // Unreachable code
    return o.getClass();
  }

  private boolean getCondition() {
      return false; // This method will always return false, but it is not a compile-time constant
  }
}