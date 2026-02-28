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
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail2() {
    try {
      for (int x = 0; x < 1000; x++) for (int y = x; y < 1000; y++) throwsNothing();
      throw new IOException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail3() {
    try {
      for (int a = 0; a < 1000; a++) for (int b = a; b < 1000; b++) throwsNothing();
      IOException e = new IOException();
      throw e;
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail4() {
    try {
      for (int c = 0; c < 1000; c++) for (int d = c; d < 1000; d++) throwsNothing();
      throwsIOException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail5() {
    try {
      for (int e = 0; e < 1000; e++) for (int f = e; f < 1000; f++) throwsNothing();
      staticThrowsIOException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- try catch could throw either of two exceptions, catches E,
  // but E not thrown
  public void testFail6() {
    try {
      for (int g = 0; g < 1000; g++) for (int h = g; h < 1000; h++) throwsNothing();
      throwsTwoExceptions();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown
  public void testPass() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw new Exception();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown indirectly
  public void testPass2() {
    try {
      for (int k = 0; k < 1000; k++) for (int l = k; l < 1000; l++) throwsNothing();
      throw anException;
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown by method
  public void testPass3() {
    try {
      for (int m = 0; m < 1000; m++) for (int n = m; n < 1000; n++) throwsNothing();
      throwsException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown by static method
  public void testPass4() {
    try {
      for (int o = 0; o < 1000; o++) for (int p = o; p < 1000; p++) throwsNothing();
      staticThrowsException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but RuntimeException caught first
  public void testPass5() {
    try {
      for (int q = 0; q < 1000; q++) for (int r = q; r < 1000; r++) throwsNothing();
      throwsIOException();
    } catch (RuntimeException e) {
      dontTriggerEmptyExceptionHandler();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
  }
}