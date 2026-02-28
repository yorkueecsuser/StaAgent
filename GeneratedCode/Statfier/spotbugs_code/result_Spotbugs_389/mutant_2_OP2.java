import java.util.Date;

class Bug1817381 {

  static boolean comparison(Object a, Object b) {
    if (a == b) {
      return true;
    }

    if (a == null && b!= null) {
      return false;
    }

    if (a!= null && b == null) {
      return false;
    }

    // Findbugs reports
    return a.equals(b);
  }

  public static void main(String[] args) {
    Date a1 = new Date();
    Date a2 = new Date(a1.getTime());
    Date b = new Date(a1.getTime() + 100000);
    System.out.println("a1 == a2 : " + (a1 == a2));
    System.out.println("a1,a1 : " + comparison(a1, a1));
    System.out.println("a1,a2 : " + comparison(a1, a2));
    System.out.println("a1,b : " + comparison(a1, b));
    System.out.println("a1,null : " + comparison(a1, null));
    System.out.println("null,a2 : " + comparison(null, a2));
    System.out.println("null,null : " + comparison(null, null));
    System.out.println("Done, no NPEs");

    // Mutant: Duplicating the assignment statement for a1
    Date a1Copy = new Date();
    Date a1Copy = new Date(); // Duplicate assignment

    // Mutant: Duplicating the assignment statement for a2
    Date a2Copy = new Date(a1.getTime());
    Date a2Copy = new Date(a1.getTime()); // Duplicate assignment

    // Mutant: Duplicating the assignment statement for b
    Date bCopy = new Date(a1.getTime() + 100000);
    Date bCopy = new Date(a1.getTime() + 100000); // Duplicate assignment
  }
}