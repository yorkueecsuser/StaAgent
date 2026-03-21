class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  for  (int fxlfftid = 0; fxlfftid < 0; fxlfftid++) {long bqtfbwng = 103785014;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}