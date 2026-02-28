import java.util.Map;

class IntHolder {
  int value;
}

class Ser implements java.io.Serializable {
  private IntHolder holder = new IntHolder();

  private Map m;

  public void set(int v) {
    holder.value = v;

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        System.out.println("This is unreachable code");
        break;
      default:
        System.out.println("Default case, also unreachable");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}