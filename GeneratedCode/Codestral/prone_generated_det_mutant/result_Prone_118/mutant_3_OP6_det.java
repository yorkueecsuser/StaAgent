class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  for  (int rcgxetwi = 0; rcgxetwi < 0; rcgxetwi++) {byte silrcxkn = 20;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}