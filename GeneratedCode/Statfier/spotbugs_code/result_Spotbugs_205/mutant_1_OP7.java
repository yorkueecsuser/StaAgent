import java.io.File;
import java.io.IOException;

class Bug2845557 {

  public Object iAmCreatingAnObject() {
    return new Object() {
      private byte[] iHaveToThrowAnException() throws IOException {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
          // Unreachable code
        }
        return Bug2845557.this.iThrowAnException();
      }
    };
  }

  private byte[] iThrowAnException() throws IOException {
    File.createTempFile("foo", "bar");
    return "Test".getBytes("UTF-8");
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}