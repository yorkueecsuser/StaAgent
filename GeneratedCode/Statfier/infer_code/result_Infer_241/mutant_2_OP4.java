import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
    } else {
      // This block will also never execute for the same reason
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
    } else {
      // This block will also never execute for the same reason
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  // Method to provide a dynamic but always false condition
  boolean getCondition() {
    return false;
  }
}