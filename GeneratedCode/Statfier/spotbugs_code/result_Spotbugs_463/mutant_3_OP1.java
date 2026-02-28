import java.io.File;

class NullStorer {

  static NullStorer nullnullnull;

  public void dance() {
    int i = 0;
    i = i++;
    System.out.println(i);
    // Dead Store Mutation
    int abcdabcd = 42; // Unused variable declaration
  }

  public void fail() {
    Integer i = 7;
    i = null;
    // Dead Store Mutation
    String efghijkl = "unused"; // Unused variable declaration
  }

  public void fail2() {
    new File("/home/dannyc/workspace/j2ee/src/share/com/sun/enterprise/deployment");
    NullStorer[] j = new NullStorer[5];
    String q = j.toString();
    System.out.println(j);
    System.out.println(q);
    Object o = new Object();
    // Dead Store Mutation
    double mnopqrst = 3.14; // Unused variable declaration
  }

  public static void main(String[] args) {
    NullStorer nullification = new NullStorer();
    nullification.dance();
    nullification.fail();
    nullification.fail2();
    nullification = null;

    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    System.out.println(nullnullnull);
    // Dead Store Mutation
    boolean tuvwxyzd = true; // Unused variable declaration
  }

  public long hashcode() {
    return 1284762451;
    // Dead Store Mutation
    char uvwxyzzz = 'a'; // Unused variable declaration
  }
}