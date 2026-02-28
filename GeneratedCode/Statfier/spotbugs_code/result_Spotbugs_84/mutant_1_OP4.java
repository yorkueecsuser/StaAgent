import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for any additional logic if needed
    } else {
      // Unreachable else branch
    }
    return next()!= null;
  }

  @Override
  public Object next() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for any additional logic if needed
    } else {
      // Unreachable else branch
    }
    return "1".substring(0);
  }

  @Override
  public void remove() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This is a placeholder for any additional logic if needed
    } else {
      // Unreachable else branch
    }
    throw new UnsupportedOperationException();
  }

  private boolean getCondition() {
    // This method always returns false, making the else branches unreachable
    return false;
  }
}