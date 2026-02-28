import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is an unreachable statement.");
    }
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("This is another unreachable statement.");
    }
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("Yet another unreachable statement.");
    }
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("And yet another unreachable statement.");
    }
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("Unreachable statement in closeOne method.");
    }
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    boolean condition = getCondition();
    if (condition) { // Unreachable if statement
      System.out.println("Unreachable statement in closeOnlyOneBad method.");
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, ensuring the if statements are unreachable
  }
}