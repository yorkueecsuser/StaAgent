import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    do {
      scan.next();
    } while (scan.hasNext());
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }
}