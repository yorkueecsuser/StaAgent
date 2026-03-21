
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    if (false && false && false && false && false && true && true && true && false && true && false) {float ftqccfwx = 601899964;}else{byte brsxquzr = 103;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}