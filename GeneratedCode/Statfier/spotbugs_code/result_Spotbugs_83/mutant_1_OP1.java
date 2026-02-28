// IteratorIdioms examples

import annotations.DetectorUnderTest;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.detect.IteratorIdioms;
import java.util.Iterator;

@DetectorUnderTest(IteratorIdioms.class)
class IteratorIdiomsTest implements Iterator {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public Object next() {
    String qjvfnxhz = "unused"; // Dead Store
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public void remove() {}
}

class NotAnIterator {

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    int kldfjvbx = 0; // Dead Store
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    return null;
  }

  public boolean hasNext() {
    return false;
  }

  public void remove() {}
}

class StringIterator implements Iterator<String> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public String next() {
    double ywqzmpoi = 3.14; // Dead Store
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public void remove() {}
}

class GenericIterator<X> implements Iterator<X> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public X next() {
    char xcvbnmjh = 'a'; // Dead Store
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public void remove() {}
}

class GenericIterator2<X extends Number> implements Iterator<X> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public X next() {
    long rtgyhujk = 123456789L; // Dead Store
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public void remove() {}
}