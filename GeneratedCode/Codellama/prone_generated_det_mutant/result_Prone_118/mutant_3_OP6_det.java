
class One {
  static class Inner {}
}

class Two extends One {}

class ShowBug {
  public static void main(String[] args) {
    for  (int kzvpqinw = 0; kzvpqinw < 0; kzvpqinw++) {boolean ttqflqhu = true;}
    System.out.println(One.Inner.class.getCanonicalName());
  
}
}