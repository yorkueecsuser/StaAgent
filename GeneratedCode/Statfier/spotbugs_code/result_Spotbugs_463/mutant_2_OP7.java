import java.io.File;

class NullStorer {

  static NullStorer nullnullnull;

  public void dance() {
    int i = 0;
    i = i++;
    System.out.println(i);

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop in dance method.");
    }
  }

  public void fail() {
    Integer i = 7;
    i = null;

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop in fail method.");
    }
  }

  public void fail2() {
    new File("/home/dannyc/workspace/j2ee/src/share/com/sun/enterprise/deployment");
    NullStorer[] j = new NullStorer[5];
    String q = j.toString();
    System.out.println(j);
    System.out.println(q);
    Object o = new Object();

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop in fail2 method.");
    }
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

    // Unreachable while loop mutant
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile is never set to true
      System.out.println("This is an unreachable loop in main method.");
    }
  }

  public long hashcode() {
    return 1284762451;
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}