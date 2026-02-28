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

  public void throwsNothing() {
    String vqjxflkd = "unused"; // Dead Store
  }

  public void throwsException() throws Exception {
    throw new Exception();
  }

  public void throwsIOException() throws IOException {
    int wvbnrhty = 42; // Dead Store
    throw new IOException();
  }

  public void throwsTwoExceptions() throws IOException, ClassNotFoundException {
    double zxcvbnml = 3.14; // Dead Store
    throw new IOException();
  }

  private void dontTriggerEmptyExceptionHandler() {
    boolean pqrsabcd = true; // Dead Store
  }

  // should fail -- catches E, but E not thrown
  public void testFail() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
    } catch (Exception e) {
      char yuiopasd = 'a'; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail2() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw new IOException();
    } catch (Exception e) {
      float hgfdsazx = 2.71f; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail3() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      IOException e = new IOException();
      throw e;
    } catch (Exception e) {
      long cvbnmkiu = 123456789L; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail4() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsIOException();
    } catch (Exception e) {
      short qwertyui = 100; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- catches E, but E not thrown
  public void testFail5() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      staticThrowsIOException();
    } catch (Exception e) {
      byte mnbvcxz = 8; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should fail -- try catch could throw either of two exceptions, catches E,
  // but E not thrown
  public void testFail6() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsTwoExceptions();
    } catch (Exception e) {
      int lkjhgfdsa = 99; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown
  public void testPass() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw new Exception();
    } catch (Exception e) {
      String asdfghjk = "another unused"; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown indirectly
  public void testPass2() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw anException;
    } catch (Exception e) {
      long poiuytrewq = 987654321L; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown by method
  public void testPass3() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsException();
    } catch (Exception e) {
      float lkjhgfds = 1.618f; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but E thrown by static method
  public void testPass4() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      staticThrowsException();
    } catch (Exception e) {
      double zxcvbnm = 2.71828; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }

  // should pass -- catches E, but RuntimeException caught first
  public void testPass5() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsIOException();
    } catch (RuntimeException e) {
      char mnbgvfcd = 'b'; // Dead Store
      dontTriggerEmptyExceptionHandler();
    } catch (Exception e) {
      int vbnrhty = 42; // Dead Store
      dontTriggerEmptyExceptionHandler();
    }
  }
}