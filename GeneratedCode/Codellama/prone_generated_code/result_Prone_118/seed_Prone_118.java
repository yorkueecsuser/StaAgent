
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    System.out.println(One.Inner.class.getCanonicalName());
  }
}