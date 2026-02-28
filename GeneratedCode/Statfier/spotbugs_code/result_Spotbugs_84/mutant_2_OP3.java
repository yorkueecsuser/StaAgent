import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
    return next()!= null;
  }

  private boolean getCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }

  @Override
  public Object next() {
    // Inserting an unreachable if statement
    boolean condition = getAnotherCondition();
    if (condition) {
      // This block is unreachable because getAnotherCondition() always returns false
      System.out.println("This is another unreachable statement.");
    }
    return "1".substring(0);
  }

  private boolean getAnotherCondition() {
    // This method always returns false, making the if block unreachable
    return false;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}