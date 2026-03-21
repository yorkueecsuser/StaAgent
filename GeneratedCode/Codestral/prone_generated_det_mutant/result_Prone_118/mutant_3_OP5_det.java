class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  int rxweslqz = 0;switch  (rxweslqz) {case 1:float qwpwawpc = -313587344;break;default:char teinyscg = 'w';break;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}