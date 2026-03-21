class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  if (true && false && false && false && true && true && false && true && false && true && false) {double uufqkbul = -334508732;}else{char zghzgghx = 'y';}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}