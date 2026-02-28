import java.io.File;
import java.io.IOException;

class Bug2845557 {

  public Object iAmCreatingAnObject() {
    return new Object() {
      private byte[] iHaveToThrowAnException() throws IOException {
        boolean condition = getCondition();
        if (condition) {
          // This block is unreachable because getCondition() will never return true
          System.out.println("This is an unreachable if statement");
        }
        return Bug2845557.this.iThrowAnException();
      }
    };
  }

  private byte[] iThrowAnException() throws IOException {
    File.createTempFile("foo", "bar");
    return "Test".getBytes("UTF-8");
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}