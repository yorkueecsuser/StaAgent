
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    if (true && false && true && true && true && true && false && true && true && false && false) {short euuvvjva = -7001;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}