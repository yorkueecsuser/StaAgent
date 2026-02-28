import java.io.IOException;

public abstract class FinallyBlockInlining {

  abstract void foo() throws IOException;

  public void bar() {
    Throwable throwable = null;
    try {
      try {
        try {
          foo();
        } catch (NullPointerException e) {
          throwable = e;
        } catch (RuntimeException e) {
          throwable = e;
        }
      } catch (IOException e) {
        throwable = e;
      }
    } catch (Error e) {
      throwable = e;
    } finally {
      // Unreachable while loop inserted here
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // This loop is unreachable because getCondition() will return false
      }

      if (throwable!= null) {
        if (throwable instanceof NullPointerException) {
          NullPointerException e = (NullPointerException) throwable;
          throw e;
        } else if (throwable instanceof RuntimeException) {
          RuntimeException e = (RuntimeException) throwable;
          throw e;
        } else if (throwable instanceof IOException) {
          RuntimeException e = new RuntimeException(throwable);
          throw e;
        } else if (throwable instanceof Error) {
          Error e = (Error) throwable;
          throw e;
        }
      }
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}