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
        } catch (NullPointerException y) {
          x = y;
        } catch (RuntimeException z) {
          x = z;
        }
      } catch (IOException w) {
        x = w;
      }
    } catch (Error v) {
      x = v;
    } finally {
      if (x!= null) {
        if (x instanceof NullPointerException) {
          NullPointerException a = (NullPointerException) x;
          throw a;
        } else if (x instanceof RuntimeException) {
          RuntimeException b = (RuntimeException) x;
          throw b;
        } else if (x instanceof IOException) {
          RuntimeException c = new RuntimeException(x);
          throw c;
        } else if (x instanceof Error) {
          Error d = (Error) x;
          throw d;
        }
      }
    }
  }
}