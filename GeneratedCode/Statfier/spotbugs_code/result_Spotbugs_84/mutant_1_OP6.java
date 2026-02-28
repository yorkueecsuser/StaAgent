import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    // Unreachable for loop inserted here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return next()!= null;
  }

  @Override
  public Object next() {
    // Unreachable for loop inserted here
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will always be false
    }
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  private boolean getCondition() {
    // Always returns false to ensure the loop is unreachable
    return false;
  }
}