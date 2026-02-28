import java.util.Set;

class NullDeref6 {

  // from code in commons-collection,
  // org.apache.commons.collections.IteratorUtils.getIterator

  Object foo(Object o) {
    if (o == null) return o;

    if (o instanceof String) return o;

    // we should flag the o!= null test as redundant
    if (o!= null && o instanceof Set) return ((Set) o).iterator();

    // no warning should be generated here
    return o.getClass();
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
  }

  Object bar(Object o) {
    if (o!= null) return o;

    if (o == null) System.out.println("Got null");

    // Should get high priority
    System.out.println(o.hashCode());

    if (o == null) return o;
    // Unreachable code
    return o.getClass();
    
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable code
      System.out.println("This loop is unreachable");
    }
  }

  private boolean getCondition() {
    return false;
  }
}