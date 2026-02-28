import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }

  // Mutated code
  void readOkMutant() {
    Scanner x = getScanner();
    while (x.hasNext()) {
      x.next();
    }
  }

  void readBadMutant() {
    Scanner y = getScanner();
    y.next();
  }

  Scanner getScannerMutant() {
    return new Scanner(System.in);
  }
}