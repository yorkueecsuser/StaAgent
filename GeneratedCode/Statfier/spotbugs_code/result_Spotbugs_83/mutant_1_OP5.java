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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case");
        break;
    }
    return null;
  }

  private boolean getCondition() {
    return false;
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case");
        break;
    }
    return null;
  }

  private boolean getCondition() {
    return false;
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case");
        break;
    }
    return null;
  }

  private boolean getCondition() {
    return false;
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case");
        break;
    }
    return null;
  }

  private boolean getCondition() {
    return false;
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
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("Unreachable case");
        break;
    }
    return null;
  }

  private boolean getCondition() {
    return false;
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