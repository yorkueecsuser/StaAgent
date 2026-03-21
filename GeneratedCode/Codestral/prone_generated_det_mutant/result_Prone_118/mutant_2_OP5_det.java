class One {
  static class Inner {}
}

class Two extends One {}

class BugDemo {
  public static Two.Inner showBug() {  int amyzhapd = 0;switch  (amyzhapd) {case 1:float sgaaxjdb = 866397932;break;default:double clbwylur = -472507058;break;}
  // BUG: NonCanonicalStaticImport
    return new Two.Inner();
  
}
}