import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    while (scan.hasNext()) {
      scan.next();
      scan.next(); // Mutant: duplicated assignment statement
    }
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
    scan.next(); // Mutant: duplicated assignment statement
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }
}