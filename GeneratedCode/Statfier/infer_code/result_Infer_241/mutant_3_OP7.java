import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Inserted unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
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