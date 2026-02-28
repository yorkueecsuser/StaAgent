import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // Unreachable code
        System.out.println("This is an unreachable switch case.");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}