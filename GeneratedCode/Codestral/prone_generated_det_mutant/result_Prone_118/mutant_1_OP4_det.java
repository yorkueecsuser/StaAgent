class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  if (false && false && false && false && false && true && true && false && true && false && false) {double maepdymg = 968613474;}else{byte jvhehbqt = -71;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}