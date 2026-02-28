import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    c.close(); // Mutant: Duplicate of c.close()
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    closeResourceOk(c); // Mutant: Duplicate of closeResourceOk(c)
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    closeResourceOk(new FileInputStream("file.txt")); // Mutant: Duplicate of closeResourceOk(new FileInputStream("file.txt"))
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    closeResourceOk(new FileInputStream("file.txt")); // Mutant: Duplicate of closeResourceOk(new FileInputStream("file.txt"))
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    c2.close(); // Mutant: Duplicate of c2.close()
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // Mutant: Duplicate of closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt"))
  }
}