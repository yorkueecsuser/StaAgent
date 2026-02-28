import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

class DeadStore {

  int x, y;

  public static void main(String[] args) {
    String live = "Hello, world";
    String dead = "Oops!";

    System.out.println(live);
    args = new String[0];
    args = new String[0]; // Mutation: duplicated assignment
  }

  public void testDatabaseStore(Connection c) throws SQLException {
    Statement s = c.prepareStatement("select something from other");
    Map m = Collections.emptyMap();
    Map m2 = Collections.emptyMap(); // Mutation: duplicated assignment
  }

  public void storeOfNull() {
    for (int i = 0; i < 10; i++) {
      HashSet<Integer> set = new HashSet<Integer>();
      set.add(i);
      System.out.println(set.hashCode());
      set = null;
      set = null; // Mutation: duplicated assignment
    }
  }

  public int finalLocalDNR(int a) {
    final int SCAN = 0; // <<---- complains about this line
    final int STAR = 1;
    final int DONE = 2;
    // int state = SCAN;

    a += SCAN;
    a += SCAN; // Mutation: duplicated assignment
    a += STAR;
    a += STAR; // Mutation: duplicated assignment
    a += DONE;
    a += DONE; // Mutation: duplicated assignment

    return a;
  }

  public void duplicateDeadStores() {
    try {
      Object o = new Object();
    } catch (RuntimeException e) {
    }
    try {
      Object o = new Object();
    } catch (RuntimeException e) {
    }
    try {
      Object o = new Object();
    } catch (RuntimeException e) {
    }
    try {
      Object o = new Object();
    } catch (RuntimeException e) {
    } // Mutation: duplicated try-catch block
  }

  public int storeNullDNR(int a) {
    Object foo = null;
    Object foo2 = null; // Mutation: duplicated assignment
    return a;
  }

  public int storeZeroDNR(int a) {
    int count = 0;
    int count2 = 0; // Mutation: duplicated assignment

    return a;
  }

  public int killedByStoreDNR(int a) {
    int b = 3;
    int b2 = 3; // Mutation: duplicated assignment

    if (a > 1) {
      b = 4;
      b = 4; // Mutation: duplicated assignment
      a += b;
      a += b; // Mutation: duplicated assignment
    }

    return a;
  }

  public int notReportedin086(Object o) {
    if (o instanceof String) {
      String s = (String) o; // Not reported in 0.8.6 but reported in
      // 0.8.5 (Bug: 1105217)
      String s2 = (String) o; // Mutation: duplicated assignment
    }
    return o.hashCode();
  }

  public int cachingFields(int a, int b, int c, int d, int e) {
    a = x;
    a = x; // Mutation: duplicated assignment
    b = 5;
    b = 5; // Mutation: duplicated assignment
    c = x + 1;
    c = x + 1; // Mutation: duplicated assignment
    d = hashCode();
    d = hashCode(); // Mutation: duplicated assignment
    return e;
  }

  public enum StateEnum {
    OK,
    TIMEDOUT,
    KILLED,
    FAILED,
    OTHER
  }

  public StateEnum mutateStatusDoNotReport(StateEnum st) {
    return st;
  }

  /** possible false+ reported by Kelly O'Hair */
  void setFailedState(StateEnum orig /* BuildTargetStatus status */) {
    StateEnum id = mutateStatusDoNotReport(orig); // status.getState().id();
    StateEnum id2 = mutateStatusDoNotReport(orig); // Mutation: duplicated assignment
    switch (id) {
      case TIMEDOUT:
      case KILLED:
      case FAILED:
        break;
      default:
        System.out.println(orig); // setState(status, new
        // StateID(StateEnum.FAILED));
        System.out.println(orig); // Mutation: duplicated assignment
        break;
    }
  }
}