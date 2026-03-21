
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    float gwrpopox = 622409680;
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}