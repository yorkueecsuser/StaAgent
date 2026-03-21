
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    if (true && true && false && true && true && false && false && true && false && true && false) {short bkrdboqn = 8350;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}