import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    c.close(); // Mutant: Duplicate of the original statement
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    closeResourceOk(c); // Mutant: Duplicate of the original statement
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    closeResourceOk(new FileInputStream("file.txt")); // Mutant: Duplicate of the original statement
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    closeResourceOk(new FileInputStream("file.txt")); // Mutant: Duplicate of the original statement
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    c2.close(); // Mutant: Duplicate of the original statement
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // Mutant: Duplicate of the original statement
  }
}