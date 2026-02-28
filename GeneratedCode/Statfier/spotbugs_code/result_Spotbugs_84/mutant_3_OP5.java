import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    return next()!= null;
  }

  @Override
  public Object next() {
    // Introducing an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        return "Unreachable";
    }
    return "1".substring(0);
  }

  private boolean getCondition() {
    // This method always returns false, making the switch case unreachable
    return false;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}