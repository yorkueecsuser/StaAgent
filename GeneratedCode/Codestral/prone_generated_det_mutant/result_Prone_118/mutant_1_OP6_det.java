class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  for  (int eoefgyln = 0; eoefgyln < 0; eoefgyln++) {byte gkinkneg = -92;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}