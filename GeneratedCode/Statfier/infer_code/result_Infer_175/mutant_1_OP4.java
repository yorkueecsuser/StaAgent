import codetoanalyze.java.annotation.SuppressLint;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// @SuppressLint("Suppressing all the warnings in a class is not supported yet")
class SuppressAllWarnigsInTheClass {

  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  void shouldNotReportResourceLeak() {
    try {
      FileInputStream fis = new FileInputStream(new File("whatever.txt"));
    } catch (IOException e) {
    }
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is dynamically determined at runtime
  }
}

class SuppressLintExample {

  @SuppressLint("null-dereference")
  SuppressLintExample() {
    Object object = null;
    object.toString();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  void shouldReportNPE() {
    Object object = null;
    object.toString();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  @SuppressLint("null-dereference")
  void shouldNotReportNPE() {
    Object object = null;
    object.toString();
    // Mutant: Inserting unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable");
    } else {
      System.out.println("This is unreachable");
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is dynamically determined at runtime
  }
}