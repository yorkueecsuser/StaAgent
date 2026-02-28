import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

class Bug2263239 {
  volatile Object[] _vol;

  Object falsePositive() {

    Object[] a = _vol;
    if (a!= null) return a;

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        Object[] temp = new Object[1];
        temp[0] = "unreachable";
        break;
      default:
        // Default case
        break;
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

  // Method to provide a dynamic condition that always evaluates to false
  private boolean getCondition() {
    return false;
  }
}