import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return next()!= null;
  }

  @Override
  public Object next() {
    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
    }
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  private boolean getCondition() {
    return false;
  }
}