class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  boolean rvqanafs = false;while (rvqanafs && false && false && true && false && true && false && false && true && false && true && false) {double nxuuzpvy = -100697622;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}