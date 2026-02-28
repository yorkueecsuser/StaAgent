import java.io.IOException;

/**
 * RECTest
 *
 * @author Brian Goetz
 */
class RECTest {
  public static Exception anException = new IOException();

  public static void staticThrowsException() throws Exception {
    throw new Exception();
  }

  public static void staticThrowsIOException() throws IOException {
    throw new IOException();
  }

  public void throwsNothing() {}

  public void throwsException() throws Exception {
    throw new Exception();
  }

  public void throwsIOException() throws IOException {
    throw new IOException();
  }

  public void throwsTwoExceptions() throws IOException, ClassNotFoundException {
    throw new IOException();
  }

  private void dontTriggerEmptyExceptionHandler() {}

  // should fail -- catches E, but E not thrown
  public void testFail() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);

    i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
  }

  // should fail -- catches E, but E not thrown
  public void testFail2() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throw new IOException();
  }

  // should fail -- catches E, but E not thrown
  public void testFail3() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    IOException e = new IOException();
    throw e;
  }

  // should fail -- catches E, but E not thrown
  public void testFail4() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throwsIOException();
  }

  // should fail -- catches E, but E not thrown
  public void testFail5() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    staticThrowsIOException();
  }

  // should fail -- try catch could throw either of two exceptions, catches E,
  // but E not thrown
  public void testFail6() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throwsTwoExceptions();
  }

  // should pass -- catches E, but E thrown
  public void testPass() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throw new Exception();
  }

  // should pass -- catches E, but E thrown indirectly
  public void testPass2() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throw anException;
  }

  // should pass -- catches E, but E thrown by method
  public void testPass3() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throwsException();
  }

  // should pass -- catches E, but E thrown by static method
  public void testPass4() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    staticThrowsException();
  }

  // should pass -- catches E, but RuntimeException caught first
  public void testPass5() {
    int i = 0;
    do {
      int j = i;
      do {
        throwsNothing();
        j++;
      } while (j < 1000);
      i++;
    } while (i < 1000);
    throwsIOException();
  }
}