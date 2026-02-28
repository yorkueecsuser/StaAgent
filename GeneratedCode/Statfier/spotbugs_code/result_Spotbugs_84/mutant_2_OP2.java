import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    return next()!= null;
  }

  @Override
  public Object next() {
    return "1".substring(0);
    return "1".substring(0); // Duplicate statement
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}