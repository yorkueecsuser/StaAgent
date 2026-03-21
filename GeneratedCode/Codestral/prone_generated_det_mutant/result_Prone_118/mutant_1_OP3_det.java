class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  if (true && true && false && true && false && true && false && true && false && true && false) {double dsqnigwt = 812626546;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}