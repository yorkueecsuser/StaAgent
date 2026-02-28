import java.io.File;

class NullStorer {

  static NullStorer nullnullnull;

  public void dance() {
    int i = 0;
    i = i++;
    System.out.println(i);
    int a = 0; // Mutated variable
    a = a++;
    System.out.println(a);
  }

  public void fail() {
    Integer i = 7;
    i = null;
    Integer b = 7; // Mutated variable
    b = null;
  }

  public void fail2() {
    new File("/home/dannyc/workspace/j2ee/src/share/com/sun/enterprise/deployment");
    NullStorer[] j = new NullStorer[5];
    String q = j.toString();
    System.out.println(j);
    System.out.println(q);
    Object o = new Object();
    NullStorer[] c = new NullStorer[5]; // Mutated variable
    String r = c.toString();
    System.out.println(c);
    System.out.println(r);
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

    NullStorer d = new NullStorer(); // Mutated variable
    d.dance();
    d.fail();
    d.fail2();
    d = null;
  }

  public long hashcode() {
    return 1284762451;
  }
}