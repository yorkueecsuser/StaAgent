import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Introduced unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Introduced unreachable for loop
    boolean conditionFor = getConditionForLoop();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getConditionForLoop() always returns false
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  // Method to provide a dynamic condition that is always false
  boolean getConditionForLoop() {
    return false;
  }
}