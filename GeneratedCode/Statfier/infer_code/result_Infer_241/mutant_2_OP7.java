import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Inserting unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop.");
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Inserting unreachable while loop
    boolean conditionWhile = getUnreachableCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop.");
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  boolean getUnreachableCondition() {
    return false;
  }
}