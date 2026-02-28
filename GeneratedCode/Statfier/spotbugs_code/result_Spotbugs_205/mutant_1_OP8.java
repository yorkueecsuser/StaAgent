import java.io.File;
import java.io.IOException;

class Bug2845557 {

  public Object iAmCreatingAnObject() {
    return new Object() {
      private byte[] iHaveToThrowAnException() throws IOException {
        return Bug2845557.this.iThrowAnException();
      }
    };
  }

  private byte[] iThrowAnException() throws IOException {
    File.createTempFile("foo", "bar");
    return "Test".getBytes("UTF-8");
  }

  // Mutated code
  public Object a() {
    return new Object() {
      private byte[] b() throws IOException {
        return Bug2845557.this.c();
      }
    };
  }

  private byte[] c() throws IOException {
    File.createTempFile("foo", "bar");
    return "Test".getBytes("UTF-8");
  }
}