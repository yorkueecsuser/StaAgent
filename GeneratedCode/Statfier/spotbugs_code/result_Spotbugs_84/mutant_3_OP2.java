import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    return next()!= null;
  }

  @Override
  public Object next() {
    String result = "1".substring(0);
    String resultCopy = result; // Duplicated assignment statement
    return result;
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}