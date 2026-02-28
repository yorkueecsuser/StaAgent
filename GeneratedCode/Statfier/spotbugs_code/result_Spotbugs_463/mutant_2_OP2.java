import java.io.File;

class NullStorer {

  static NullStorer nullnullnull;

  public void dance() {
    int i = 0;
    i = i++;
    i = i++; // Mutant: duplicated assignment statement
    System.out.println(i);
  }

  public void fail() {
    Integer i = 7;
    i = null;
    i = null; // Mutant: duplicated assignment statement
  }

  public void fail2() {
    new File("/home/dannyc/workspace/j2ee/src/share/com/sun/enterprise/deployment");
    NullStorer[] j = new NullStorer[5];
    j = new NullStorer[5]; // Mutant: duplicated assignment statement
    String q = j.toString();
    System.out.println(j);
    System.out.println(q);
    Object o = new Object();
  }

  public static void main(String[] args) {
    NullStorer nullification = new NullStorer();
    nullification.dance();
    nullification.fail();
    nullification.fail2();
    nullification = null;
    nullification = null; // Mutant: duplicated assignment statement

    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null;
    nullnullnull = null; // Mutant: duplicated assignment statement
    System.out.println(nullnullnull);
  }

  public long hashcode() {
    return 1284762451;
  }
}