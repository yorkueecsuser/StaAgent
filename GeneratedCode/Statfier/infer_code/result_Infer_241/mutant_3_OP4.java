import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Mutant code: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable.");
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Mutant code: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is reachable
      System.out.println("This block is reachable.");
    } else {
      // This block is unreachable
      System.out.println("This block is unreachable.");
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  // Method to provide a dynamic condition that will always be false
  boolean getCondition() {
    return false;
  }
}