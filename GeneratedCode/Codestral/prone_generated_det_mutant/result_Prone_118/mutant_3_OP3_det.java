class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  if (true && false && true && false && false && true && true && false && true && false && false) {String dfazkach = "cgsegyjs";}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}