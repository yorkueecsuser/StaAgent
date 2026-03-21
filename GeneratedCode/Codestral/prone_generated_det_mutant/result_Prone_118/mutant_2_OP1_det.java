class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  int nlbmuhat = -722024882;
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}