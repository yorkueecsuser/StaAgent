class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  char gghgpngj = 'a';
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}