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
          throwable = e; // Mutation: duplicated assignment
        } catch (RuntimeException e) {
          throwable = e;
          throwable = e; // Mutation: duplicated assignment
        }
      } catch (IOException e) {
        throwable = e;
        throwable = e; // Mutation: duplicated assignment
      }
    } catch (Error e) {
      throwable = e;
      throwable = e; // Mutation: duplicated assignment
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
  }
}