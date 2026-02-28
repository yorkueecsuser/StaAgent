import java.util.Set;

class NullDeref6 {

  // from code in commons-collection,
  // org.apache.commons.collections.IteratorUtils.getIterator

  Object foo(Object o) {
    if (o == null) return o;
    if (o == null) return o; // Mutant: duplicated the assignment-like return statement

    if (o instanceof String) return o;
    if (o instanceof String) return o; // Mutant: duplicated the assignment-like return statement

    // we should flag the o!= null test as redundant
    if (o!= null && o instanceof Set) return ((Set) o).iterator();
    if (o!= null && o instanceof Set) return ((Set) o).iterator(); // Mutant: duplicated the assignment-like return statement

    // no warning should be generated here
    return o.getClass();
  }

  Object bar(Object o) {
    if (o!= null) return o;
    if (o!= null) return o; // Mutant: duplicated the assignment-like return statement

    if (o == null) System.out.println("Got null");
    if (o == null) System.out.println("Got null"); // Mutant: duplicated the assignment-like print statement

    // Should get high priority
    System.out.println(o.hashCode());

    if (o == null) return o;
    if (o == null) return o; // Mutant: duplicated the assignment-like return statement
    // Unreachable code
    return o.getClass();
  }
}