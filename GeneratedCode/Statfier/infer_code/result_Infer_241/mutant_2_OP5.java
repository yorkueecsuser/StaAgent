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
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in readOk");
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
        // This case will never be executed because condition is always false
        System.out.println("This is an unreachable case in readBad");
        break;
    }
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  boolean getCondition() {
    // This method always returns false, making the switch statement unreachable
    return false;
  }
}