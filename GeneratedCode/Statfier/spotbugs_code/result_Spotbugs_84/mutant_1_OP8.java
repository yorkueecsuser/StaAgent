import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    return next()!= null;
  }

  @Override
  public Object next() {
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }

  // Mutated code with renaming operator
  private int a; // New variable introduced for mutation

  @Override
  public boolean hasNext() {
    return next()!= null;
  }

  @Override
  public Object next() {
    a = 5; // Using the new variable 'a' in the method
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}