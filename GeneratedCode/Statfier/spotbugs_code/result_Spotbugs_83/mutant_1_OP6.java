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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}

class NotAnIterator {

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  public boolean hasNext() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return false;
  }

  public void remove() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  public Object next(boolean dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @NoWarning("IT_NO_SUCH_ELEMENT")
  protected Object next(int dummy) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
    return false;
  }

  @Override
  public void remove() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop
    }
  }

  private boolean getCondition() {
    return false;
  }
}