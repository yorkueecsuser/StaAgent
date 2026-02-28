import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    return next()!= null;
  }

  @Override
  public Object next() {
    // Introduced an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be reached because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        // Default case
        break;
    }
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  // Method to dynamically determine the condition at runtime
  private boolean getCondition() {
    return false;
  }
}