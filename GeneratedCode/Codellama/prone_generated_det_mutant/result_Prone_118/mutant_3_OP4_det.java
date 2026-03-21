
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    if (true && true && false && true && true && true && true && false && true && true && false) {short rgmeuqpe = 2140;}else{boolean qlkqghbb = false;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}