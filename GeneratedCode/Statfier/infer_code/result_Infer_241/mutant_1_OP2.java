import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
      scan.next(); // Mutant: Duplicate of scan.next();
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    scan.next(); // Mutant: Duplicate of scan.next();
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }
}