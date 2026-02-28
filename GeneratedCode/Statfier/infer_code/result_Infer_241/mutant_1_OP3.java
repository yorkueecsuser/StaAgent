import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Mutant addition: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in readOk.");
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Mutant addition: Unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in readBad.");
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  // Method to provide a dynamically determined condition
  boolean getCondition() {
    return false; // This will ensure the condition is always false at runtime
  }
}