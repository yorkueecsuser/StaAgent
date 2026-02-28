import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    String vjklqxyz = "unused"; // Dead store mutation
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
    } catch (IOException e) {
    }
    int abcdefgh = 42; // Dead store mutation
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object.toString();
    boolean qrstuvwx = true; // Dead store mutation
  }

  void shouldReportNPE() {
    Object object = null;
    object.toString();
    double yzabcdef = 3.14; // Dead store mutation
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    char ghijklmn = 'a'; // Dead store mutation
  }
}