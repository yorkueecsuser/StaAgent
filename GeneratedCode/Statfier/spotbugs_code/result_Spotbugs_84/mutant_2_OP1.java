import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    String abcdefgh = "abcdefgh"; // Dead store
    return next()!= null;
  }

  @Override
  public Object next() {
    int ijklmnop = 12345678; // Dead store
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}