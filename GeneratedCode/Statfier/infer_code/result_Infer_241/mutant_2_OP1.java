import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
    // Dead store mutation
    String abcdefgh = "unusedVariable";
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    // Dead store mutation
    int hijklmno = 42;
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }
}