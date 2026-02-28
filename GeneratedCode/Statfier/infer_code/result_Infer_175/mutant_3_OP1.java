import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    String vjxqzrht = "unused"; // Dead store
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
      int kfnrhtyv = 0; // Dead store
    } catch (IOException e) {
    }
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object.toString();
    boolean qzjfnrht = true; // Dead store
  }

  void shouldReportNPE() {
    Object object = null;
    object.toString();
    char xqzjfnrt = 'a'; // Dead store
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    double yvqzjfnr = 3.14; // Dead store
  }
}