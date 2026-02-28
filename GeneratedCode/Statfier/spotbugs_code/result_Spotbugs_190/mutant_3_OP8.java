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

    // Mutant code with renamed variable 'throwable' to 'a'
    Throwable a = null;
    try {
      try {
        try {
          foo();
        } catch (NullPointerException e) {
          a = e;
        } catch (RuntimeException e) {
          a = e;
        }
      } catch (IOException e) {
        a = e;
      }
    } catch (Error e) {
      a = e;
    } finally {
      if (a!= null) {
        if (a instanceof NullPointerException) {
          NullPointerException e = (NullPointerException) a;
          throw e;
        } else if (a instanceof RuntimeException) {
          RuntimeException e = (RuntimeException) a;
          throw e;
        } else if (a instanceof IOException) {
          RuntimeException e = new RuntimeException(a);
          throw e;
        } else if (a instanceof Error) {
          Error e = (Error) a;
          throw e;
        }
      }
    }
  }
}