
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    String qzviglmd = "ugzcedrn";
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}