class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  int erilnvnt = 0;switch  (erilnvnt) {case 1:char gixzeygv = 'u';break;default:byte tocbzdxx = 121;break;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}