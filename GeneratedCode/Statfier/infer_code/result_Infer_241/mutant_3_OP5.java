import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        break;
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
      default:
        break;
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