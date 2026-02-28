import java.io.File;

class NullStorer {

  static NullStorer nullnullnull;

  public void dance() {
    int i = 0;
    i = i++;
    System.out.println(i);
    // Mutant: Rename variable 'i' to 'a'
    int a = 0;
    a = a++;
    System.out.println(a);
  }

  public void fail() {
    Integer i = 7;
    i = null;
    // Mutant: Rename variable 'i' to 'b'
    Integer b = 7;
    b = null;
  }

  public void fail2() {
    new File("/home/dannyc/workspace/j2ee/src/share/com/sun/enterprise/deployment");
    NullStorer[] j = new NullStorer[5];
    String q = j.toString();
    System.out.println(j);
    System.out.println(q);
    Object o = new Object();
    // Mutant: Rename variable 'j' to 'c'
    NullStorer[] c = new NullStorer[5];
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
    // Mutant: Rename variable 'args' to 'd'
    String[] d = args;
    System.out.println(d.length);
  }

  public long hashcode() {
    return 1284762451;
  }
}