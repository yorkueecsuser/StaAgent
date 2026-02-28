import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

class Bug2263239 {
  volatile Object[] _vol;

  Object falsePositive() {

    Object[] a = _vol;
    if (a!= null) return a;

    // Inserting unreachable if branch
    boolean condition = getUnreachableCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable statement");
    }

    Object[] b = _vol;
    if (b!= null) return b;

    return "foo";
  }

  private final AtomicReferenceFieldUpdater<Bug2263239, Object[]> _newUpdater =
      AtomicReferenceFieldUpdater.newUpdater(Bug2263239.class, Object[].class, "_vol");

  void cas(Object[] expect, Object[] update) {
    _newUpdater.compareAndSet(this, expect, update);
  }

  // Method to provide a dynamically determined condition that is always false
  private boolean getUnreachableCondition() {
    return false; // This method will always return false, but it is not a compile-time constant
  }
}