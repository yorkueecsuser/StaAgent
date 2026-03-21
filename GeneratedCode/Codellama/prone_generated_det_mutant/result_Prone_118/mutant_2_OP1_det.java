
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    short utouzlno = 4120;
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}