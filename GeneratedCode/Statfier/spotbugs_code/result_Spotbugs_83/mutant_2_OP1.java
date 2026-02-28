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
    String qzjxmtkp = "unused"; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    int vbnrhtyp = 0; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean lmnopqrs = true; // Dead store mutation
    return null;
  }

  @Override
  public boolean hasNext() {
    double wxyzabcd = 3.14; // Dead store mutation
    return false;
  }

  @Override
  public void remove() {}
}

class NotAnIterator {

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    char efghijkl = 'a'; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    float mnopqrst = 2.71f; // Dead store mutation
    return null;
  }

  public boolean hasNext() {
    long uvwxyzab = 100L; // Dead store mutation
    return false;
  }

  public void remove() {}
}

class StringIterator implements Iterator<String> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public String next() {
    short cdefghij = 10; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    byte klmnopqr = 5; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    long stuvwxyz = 999L; // Dead store mutation
    return null;
  }

  @Override
  public boolean hasNext() {
    int abcdefgh = 42; // Dead store mutation
    return false;
  }

  @Override
  public void remove() {}
}

class GenericIterator<X> implements Iterator<X> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public X next() {
    double pqrsabcd = 1.618; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    char tuvwxyza = 'b'; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    float bcdefghi = 0.577f; // Dead store mutation
    return null;
  }

  @Override
  public boolean hasNext() {
    short jklmnopq = 20; // Dead store mutation
    return false;
  }

  @Override
  public void remove() {}
}

class GenericIterator2<X extends Number> implements Iterator<X> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public X next() {
    long rstuvwxy = 123456789L; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    int zabcdefghi = 88; // Dead store mutation
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    double jklmnopq = 0.001; // Dead store mutation
    return null;
  }

  @Override
  public boolean hasNext() {
    char rstuvwxy = 'c'; // Dead store mutation
    return false;
  }

  @Override
  public void remove() {}
}