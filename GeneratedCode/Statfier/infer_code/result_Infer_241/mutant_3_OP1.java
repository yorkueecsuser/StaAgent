import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Dead Store Mutation
    String qwejrtyp = "unusedVariable";
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Dead Store Mutation
    int fghjklzx = 42;
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }
}