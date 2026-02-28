import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class LeaksAccessPathsInterprocedural {

  void closeResourceOk(Closeable c) throws IOException {
    c.close();
    String abcd1234 = "unusedVariable"; // Dead Store
  }

  void closeResourceWrapperOk(Closeable c) throws IOException {
    closeResourceOk(c);
    int efgh5678 = 42; // Dead Store
  }

  void closeResourceDirectOK() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    boolean ijkl9012 = true; // Dead Store
  }

  void closeResourceTransitiveOk() throws IOException, FileNotFoundException {
    closeResourceOk(new FileInputStream("file.txt"));
    double mnop3456 = 3.14; // Dead Store
  }

  void closeOne(Closeable c1, Closeable c2) throws IOException {
    c2.close();
    char qrst7890 = 'x'; // Dead Store
  }

  void closeOnlyOneBad() throws IOException, FileNotFoundException {
    closeOne(new FileInputStream("1.txt"), new FileInputStream("2.txt")); // warning
    long uvwx1234 = 123456789L; // Dead Store
  }
}