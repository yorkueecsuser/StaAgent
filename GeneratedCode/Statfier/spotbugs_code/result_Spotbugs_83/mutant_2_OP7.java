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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  private boolean getCondition() {
    return false;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }
}

class NotAnIterator {

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  public boolean hasNext() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return false;
  }

  public void remove() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class StringIterator implements Iterator<String> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public String next() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class GenericIterator<X> implements Iterator<X> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public X next() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class GenericIterator2<X extends Number> implements Iterator<X> {
  @ExpectWarning("IT_NO_SUCH_ELEMENT")
  @Override
  public X next() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  private boolean getCondition() {
    return false;
  }
}