import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is an unreachable if statement.");
    }
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("This is another unreachable if statement.");
    }
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Yet another unreachable if statement.");
    }
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("And yet another unreachable if statement.");
    }
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in closeOne method.");
    }
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      System.out.println("Unreachable if statement in closeOnlyOneBad method.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always false
  }
}