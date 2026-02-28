import java.io.File;

class NullStorer {

  static NullStorer nullnullnull;

  public void dance() {
    int i = 0;
    i = i++;
    System.out.println(i);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This is unreachable code in dance method.");
    }
  }

  public void fail() {
    Integer i = 7;
    i = null;

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int j = 0; conditionFor; j++) {
      // Unreachable code
      System.out.println("This is unreachable code in fail method.");
    }
  }

  public void fail2() {
    new File("/home/dannyc/workspace/j2ee/src/share/com/sun/enterprise/deployment");
    NullStorer[] j = new NullStorer[5];
    String q = j.toString();
    System.out.println(j);
    System.out.println(q);
    Object o = new Object();

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int k = 0; conditionFor; k++) {
      // Unreachable code
      System.out.println("This is unreachable code in fail2 method.");
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

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int l = 0; conditionFor; l++) {
      // Unreachable code
      System.out.println("This is unreachable code in main method.");
    }
  }

  public long hashcode() {
    return 1284762451;
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}