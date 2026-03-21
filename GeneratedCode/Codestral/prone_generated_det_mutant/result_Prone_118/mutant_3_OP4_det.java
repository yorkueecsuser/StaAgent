class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  if (false && true && true && false && false && false && false && false && false && false && false) {short ognxcazt = -8650;}else{double gaexpyyw = 157939355;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}