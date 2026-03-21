class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  if (true && true && true && true && true && false && false && true && true && true && false) {byte nzmkthzm = 110;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}