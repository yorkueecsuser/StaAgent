import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    c.close(); // Mutant: duplicated the close statement
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    closeResourceOk(c); // Mutant: duplicated the method call
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    closeResourceOk(new FileInputStream("file.txt")); // Mutant: duplicated the method call with new object
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    closeResourceOk(new FileInputStream("file.txt")); // Mutant: duplicated the method call with new object
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    c2.close(); // Mutant: duplicated the close statement
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // Mutant: duplicated the method call with new objects
  }
}