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

  // Mutated code
  @Override
  public boolean hasx(y) {
    return z()!= null;
  }

  @Override
  public Object z() {
    return "1".substring(0);
  }

  @Override
  public void a() {
    throw new UnsupportedOperationException();
  }
}