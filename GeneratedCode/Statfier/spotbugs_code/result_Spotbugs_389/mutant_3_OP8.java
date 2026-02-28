import java.util.Date;

class Bug1817381 {

  static boolean comparison(Object x, Object b) {
    if (x == b) {
      return true;
    }

    if (x == null && b!= null) {
      return false;
    }

    if (x!= null && b == null) {
      return false;
    }

    // Findbugs reports
    return x.equals(b);
  }

  public static void main(String[] args) {
    Date a1 = new Date();
    Date a2 = new Date(a1.getTime());
    Date c = new Date(a1.getTime() + 100000);
    System.out.println("a1 == a2 : " + (a1 == a2));
    System.out.println("a1,a1 : " + comparison(a1, a1));
    System.out.println("a1,a2 : " + comparison(a1, a2));
    System.out.println("a1,c : " + comparison(a1, c));
    System.out.println("a1,null : " + comparison(a1, null));
    System.out.println("null,a2 : " + comparison(null, a2));
    System.out.println("null,null : " + comparison(null, null));
    System.out.println("Done, no NPEs");
  }
}