
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    if (true && true && false && false && false && true && true && false && true && false && false) {byte kczswetv = 90;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}