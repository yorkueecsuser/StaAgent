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
    dead = "Oops!"; // Mutation: Duplicate assignment

    System.out.println(live);
    args = new String[0];
  }

  public void testDatabaseStore(Connection c) throws SQLException {
    Statement s = c.prepareStatement("select something from other");
    Map m = Collections.emptyMap();
    m = Collections.emptyMap(); // Mutation: Duplicate assignment
  }

  public void storeOfNull() {
    for (int i = 0; i < 10; i++) {
      HashSet<Integer> set = new HashSet<Integer>();
      set.add(i);
      System.out.println(set.hashCode());
      set = null;
      set = null; // Mutation: Duplicate assignment
    }
  }

  public int finalLocalDNR(int a) {
    final int SCAN = 0; // <<---- complains about this line
    final int STAR = 1;
    final int DONE = 2;
    // int state = SCAN;

    a += SCAN;
    a += SCAN; // Mutation: Duplicate assignment
    a += STAR;
    a += DONE;

    return a;
  }

  public void duplicateDeadStores() {
    try {
      Object o = new Object();
      o = new Object(); // Mutation: Duplicate assignment
    } catch (RuntimeException e) {
    }
    try {
      Object o = new Object();
      o = new Object(); // Mutation: Duplicate assignment
    } catch (RuntimeException e) {
    }
    try {
      Object o = new Object();
      o = new Object(); // Mutation: Duplicate assignment
    } catch (RuntimeException e) {
    }
  }

  public int storeNullDNR(int a) {
    Object foo = null;
    foo = null; // Mutation: Duplicate assignment
    return a;
  }

  public int storeZeroDNR(int a) {
    int count = 0;
    count = 0; // Mutation: Duplicate assignment

    return a;
  }

  public int killedByStoreDNR(int a) {
    int b = 3;
    b = 3; // Mutation: Duplicate assignment

    if (a > 1) {
      b = 4;
      b = 4; // Mutation: Duplicate assignment
      a += b;
    }

    return a;
  }

  public int notReportedin086(Object o) {
    if (o instanceof String) {
      String s = (String) o; // Not reported in 0.8.6 but reported in
      // 0.8.5 (Bug: 1105217)
      s = (String) o; // Mutation: Duplicate assignment
    }
    return o.hashCode();
  }

  public int cachingFields(int a, int b, int c, int d, int e) {
    a = x;
    a = x; // Mutation: Duplicate assignment
    b = 5;
    b = 5; // Mutation: Duplicate assignment
    c = x + 1;
    c = x + 1; // Mutation: Duplicate assignment
    d = hashCode();
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
    id = mutateStatusDoNotReport(orig); // Mutation: Duplicate assignment
    switch (id) {
      case TIMEDOUT:
      case KILLED:
      case FAILED:
        break;
      default:
        System.out.println(orig); // setState(status, new
        // StateID(StateEnum.FAILED));
        break;
    }
  }
}