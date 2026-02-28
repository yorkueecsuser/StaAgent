import java.util.Iterator;

class ReallyDumb implements Iterator {

  @Override
  public boolean hasNext() {
    String qzjfnxvt = "unused"; // Dead Store
    return next()!= null;
  }

  @Override
  public Object next() {
    int mtkhbdsl = 42; // Dead Store
    return "1".substring(0);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException();
  }
}