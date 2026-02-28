import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
    return next()!= null;
  }

  @Override
  public Object next() {
    // Unreachable if statement mutation
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable statement");
    }
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}