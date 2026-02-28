import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    
    // Mutant
    Object x = null;
    x.toString();
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
    } catch (IOException e) {
    }
    
    // Mutant
    try {
      FileInputStream y = new FileInputStream(new File("whatever.txt"));
    } catch (IOException e) {
    }
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object.toString();
    
    // Mutant
    Object z = null;
    z.toString();
  }

  void shouldReportNPE() {
    Object object = null;
    object.toString();
    
    // Mutant
    Object a = null;
    a.toString();
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    
    // Mutant
    Object b = null;
    b.toString();
  }
}