import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in hasNext()");
    }
    return next()!= null;
  }

  @Override
  public Object next() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in next()");
    }
    return "1".substring(0);
  }

  @Override
  public void remove() {
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable block in remove()");
    }
    throw new UnsupportedOperationException();
  }

  private boolean getCondition() {
    return false;
  }
}