import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

class Bug2263239 {
  volatile Object[] _vol;

  Object falsePositive() {

    Object[] a = _vol;
    if (a!= null) return a;

    Object[] b = _vol;
    if (b!= null) return b;

    // Inserting unreachable if-else branch
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      return "unreachable";
    } else {
      // This block is also intended to be unreachable
      return "still unreachable";
    }

    return "foo";
  }

  private final AtomicReferenceFieldUpdater<Bug2263239, Object[]> _newUpdater =
      AtomicReferenceFieldUpdater.newUpdater(Bug2263239.class, Object[].class, "_vol");

  void cas(Object[] expect, Object[] update) {
    _newUpdater.compareAndSet(this, expect, update);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}