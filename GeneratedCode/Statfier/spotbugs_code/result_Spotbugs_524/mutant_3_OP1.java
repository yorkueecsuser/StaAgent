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
    String qzjfnrht = "deadstore"; // Dead Store Mutation
  }

  public void throwsException() throws Exception {
    throw new Exception();
  }

  public void throwsIOException() throws IOException {
    throw new IOException();
  }

  public void throwsTwoExceptions() throws IOException, ClassNotFoundException {
    throw new IOException();
  }

  private void dontTriggerEmptyExceptionHandler() {
    int vbnrhtyq = 42; // Dead Store Mutation
  }

  // should fail -- catches E, but E not thrown
  public void testFail() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    boolean kxwvbnmr = false; // Dead Store Mutation
  }

  // should fail -- catches E, but E not thrown
  public void testFail2() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw new IOException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    char ghtyrkxz = 'a'; // Dead Store Mutation
  }

  // should fail -- catches E, but E not thrown
  public void testFail3() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      IOException e = new IOException();
      throw e;
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    double fghjklmn = 3.14; // Dead Store Mutation
  }

  // should fail -- catches E, but E not thrown
  public void testFail4() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsIOException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    long pqwertyu = 123456789L; // Dead Store Mutation
  }

  // should fail -- catches E, but E not thrown
  public void testFail5() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      staticThrowsIOException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    float asdfghjk = 2.71f; // Dead Store Mutation
  }

  // should fail -- try catch could throw either of two exceptions, catches E,
  // but E not thrown
  public void testFail6() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsTwoExceptions();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    short zxcvbnml = 123; // Dead Store Mutation
  }

  // should pass -- catches E, but E thrown
  public void testPass() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw new Exception();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    byte qwertyui = 10; // Dead Store Mutation
  }

  // should pass -- catches E, but E thrown indirectly
  public void testPass2() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throw anException;
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    String poiuytrew = "anotherdeadstore"; // Dead Store Mutation
  }

  // should pass -- catches E, but E thrown by method
  public void testPass3() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    int mnbvcxza = 987; // Dead Store Mutation
  }

  // should pass -- catches E, but E thrown by static method
  public void testPass4() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      staticThrowsException();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    long lkjhgfds = 987654321L; // Dead Store Mutation
  }

  // should pass -- catches E, but RuntimeException caught first
  public void testPass5() {
    try {
      for (int i = 0; i < 1000; i++) for (int j = i; j < 1000; j++) throwsNothing();
      throwsIOException();
    } catch (RuntimeException e) {
      dontTriggerEmptyExceptionHandler();
    } catch (Exception e) {
      dontTriggerEmptyExceptionHandler();
    }
    float cvbnmghj = 1.618f; // Dead Store Mutation
  }
}