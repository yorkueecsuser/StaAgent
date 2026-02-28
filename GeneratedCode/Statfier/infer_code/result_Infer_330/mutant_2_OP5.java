import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    boolean condition = getCondition();
    switch(condition) {
      case true:
        // unreachable code
        System.out.println("This is unreachable code");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}