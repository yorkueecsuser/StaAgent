import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    
    // Mutant: Renaming 'object' to 'a'
    Object a = null;
    a.toString();
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
    } catch (IOException e) {
    }
    
    // Mutant: Renaming 'fis' to 'b'
    try {
      FileInputStream b = new FileInputStream(new File("whatever.txt"));
    } catch (IOException e) {
    }
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object.toString();
    
    // Mutant: Renaming 'object' to 'c'
    Object c = null;
    c.toString();
  }

  void shouldReportNPE() {
    Object object = null;
    object.toString();
    
    // Mutant: Renaming 'object' to 'd'
    Object d = null;
    d.toString();
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    
    // Mutant: Renaming 'object' to 'e'
    Object e = null;
    e.toString();
  }
}