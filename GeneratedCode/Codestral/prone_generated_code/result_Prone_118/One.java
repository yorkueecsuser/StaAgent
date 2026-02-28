class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  }
}