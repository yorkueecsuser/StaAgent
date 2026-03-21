class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  boolean vtpxjawu = false;while (vtpxjawu && false && false && true && false && true && true && true && true && false && true && false) {char dkddhwln = 'b';}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}