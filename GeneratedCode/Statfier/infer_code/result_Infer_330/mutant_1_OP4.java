import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block");
    }
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in wrapper");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in wrapper");
    }
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in direct OK");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in direct OK");
    }
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in transitive OK");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in transitive OK");
    }
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in closeOne");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in closeOne");
    }
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    boolean condition = getCondition();
    if (condition) {
      // Some code that should never run
      System.out.println("This is an unreachable if block in closeOnlyOneBad");
    } else {
      // Some alternative code that should also never run
      System.out.println("This is an unreachable else block in closeOnlyOneBad");
    }
  }

  private boolean getCondition() {
    return false; // This method will always return false, ensuring the branches are unreachable
  }
}