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

    // Mutated code
    Throwable x = null;
    try {
      try {
        try {
          foo();
        } catch (NullPointerException e) {
          x = e;
        } catch (RuntimeException e) {
          x = e;
        }
      } catch (IOException e) {
        x = e;
      }
    } catch (Error e) {
      x = e;
    } finally {
      if (x!= null) {
        if (x instanceof NullPointerException) {
          NullPointerException e = (NullPointerException) x;
          throw e;
        } else if (x instanceof RuntimeException) {
          RuntimeException e = (RuntimeException) x;
          throw e;
        } else if (x instanceof IOException) {
          RuntimeException e = new RuntimeException(x);
          throw e;
        } else if (x instanceof Error) {
          Error e = (Error) x;
          throw e;
        }
      }
    }
  }
}