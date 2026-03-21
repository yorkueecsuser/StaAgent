
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    if (false && false && true && true && true && false && true && false && false && false && false) {byte pnblnxhi = 33;}else{double gnujjjwp = -155779109;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}