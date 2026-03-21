class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  boolean vqouurjy = false;while (vqouurjy && false && false && false && true && false && false && false && false && false && false && false) {char qgqelxvj = 'r';}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}