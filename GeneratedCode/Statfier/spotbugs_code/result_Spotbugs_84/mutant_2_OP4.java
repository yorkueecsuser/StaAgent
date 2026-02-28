import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    } else {
      System.out.println("This is unreachable code.");
    }
    return next()!= null;
  }

  private boolean getCondition() {
    return true; // This ensures the if block is reachable and else is unreachable
  }

  @Override
  public Object next() {
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code in next method.");
    } else {
      System.out.println("This is unreachable code in next method.");
    }
    return "1".substring(0);
  }

  private boolean getConditionForNext() {
    return true; // This ensures the if block is reachable and else is unreachable
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}