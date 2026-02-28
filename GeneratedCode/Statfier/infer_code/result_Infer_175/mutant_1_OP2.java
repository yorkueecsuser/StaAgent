import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object = null; // Mutant: duplicated assignment
    object.toString();
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
      fis = new FileInputStream(new File("whatever.txt")); // Mutant: duplicated assignment
    } catch (IOException e) {
    }
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object = null; // Mutant: duplicated assignment
    object.toString();
  }

  void shouldReportNPE() {
    Object object = null;
    object = null; // Mutant: duplicated assignment
    object.toString();
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object = null; // Mutant: duplicated assignment
    object.toString();
  }
}