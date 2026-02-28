import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Ideas_2009_04_26 {

  private List<String> status_ = new ArrayList<String>();

  public String getStatus(int i) {
    assert i >= 0 && i < (status_ == null? 0 : status_.size());
    return status_.get(i);
  }

  abstract static class AbstractIterator<T> implements Iterator<T> {

    T nextElement = nextElement();

    abstract T nextElement();

    @Override
    public boolean hasNext() {
      return nextElement!= null;
    }

    @Override
    public T next() {
      if (!hasNext()) throw new NoSuchElementException();
      T result = nextElement;
      nextElement = nextElement();
      // Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
      return result;
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }

    private boolean getCondition() {
      return false; // This method ensures the condition is not a compile-time constant
    }
  }

  static Iterator<Integer> count(final int lastValue) {
    return new AbstractIterator<Integer>() {
      int value = 1;

      @Override
      Integer nextElement() {
        if (value > lastValue) return null;
        return value++;
      }
    };
  }

  public static void main(String arg[]) {
    for (Iterator i = count(10); i.hasNext(); ) System.out.println(i.next());
    // Inserting unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is another unreachable if statement");
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is not a compile-time constant
  }
}