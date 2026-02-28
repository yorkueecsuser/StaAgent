import java.util.Scanner;

abstract class ScannerFail {
  void readOk() {
    Scanner scan = getScanner();
    do {
      if (!scan.hasNext()) break;
      scan.next();
    } while (true);
  }

  void readBad() {
    Scanner scan = getScanner();
    scan.next();
  }

  Scanner getScanner() {
    return new Scanner(System.in);
  }
}