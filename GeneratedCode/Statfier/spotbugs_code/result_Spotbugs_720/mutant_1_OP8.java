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
  }

  // Mutant with renamed variable 'o' to 'x'
  Object foox(Object x) {
    if (x == null) return x;

    if (x instanceof String) return x;

    // we should flag the x!= null test as redundant
    if (x!= null && x instanceof Set) return ((Set) x).iterator();

    // no warning should be generated here
    return x.getClass();
  }

  Object bar(Object o) {
    if (o!= null) return o;

    if (o == null) System.out.println("Got null");

    // Should get high priority
    System.out.println(o.hashCode());

    if (o == null) return o;
    // Unreachable code
    return o.getClass();
  }

  // Mutant with renamed variable 'o' to 'y'
  Object bary(Object y) {
    if (y!= null) return y;

    if (y == null) System.out.println("Got null");

    // Should get high priority
    System.out.println(y.hashCode());

    if (y == null) return y;
    // Unreachable code
    return y.getClass();
  }
}