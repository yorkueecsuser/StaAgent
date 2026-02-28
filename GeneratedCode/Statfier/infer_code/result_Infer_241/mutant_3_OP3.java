import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in readOk");
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Mutant: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement in readBad");
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  // Method to provide a dynamic condition that is always false
  boolean getCondition() {
    return false;
  }
}