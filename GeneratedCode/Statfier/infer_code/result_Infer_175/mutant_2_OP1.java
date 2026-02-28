import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    String qzjfnxht = "unusedVariable"; // Dead store mutation
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
      int vbnrhtyx = 42; // Dead store mutation
    } catch (IOException e) {
    }
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object.toString();
    double xwvfrtuj = 3.14; // Dead store mutation
  }

  void shouldReportNPE() {
    Object object = null;
    object.toString();
    boolean klmnopqr = true; // Dead store mutation
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    char ijklmnop = 'a'; // Dead store mutation
  }
}