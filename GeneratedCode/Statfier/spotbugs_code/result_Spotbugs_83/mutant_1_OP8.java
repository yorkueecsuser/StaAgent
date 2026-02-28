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
    return null;
  }

  @NoWarning("IT_NO_Such_ELEMENT")
  public Object next(boolean z) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int x) {
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
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int y) {
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
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean a) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int b) {
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
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean c) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int d) {
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
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean e) {
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int f) {
    return null;
  }

  @Override
  public boolean hasNext() {
    return false;
  }

  @Override
  public void remove() {}
}