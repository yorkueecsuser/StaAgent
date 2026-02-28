import java.io.File;
import java.io.IOException;

class Bug2845557 {

  public Object iAmCreatingAnObject() {
    return new Object() {
      private byte[] iHaveToThrowAnException() throws IOException {
        boolean shouldRun = getCondition();
        if (shouldRun) {
          // Some unreachable code
          System.out.println("This is unreachable code.");
        } else {
          // Alternative unreachable code
          System.out.println("This is also unreachable code.");
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
    // This method returns a condition that is always false at runtime
    return false;
  }
}