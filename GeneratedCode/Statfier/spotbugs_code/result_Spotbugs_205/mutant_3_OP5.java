import java.io.File;
import java.io.IOException;

class Bug2845557 {

  public Object iAmCreatingAnObject() {
    return new Object() {
      private byte[] iHaveToThrowAnException() throws IOException {
        boolean condition = getCondition();
        switch(condition) {
          case true: 
            // This case will never be reached because getCondition() does not return true
            System.out.println("This is an unreachable case.");
            break;
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
    // This method always returns false, ensuring the switch case remains unreachable
    return false;
  }
}