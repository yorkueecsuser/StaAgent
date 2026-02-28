import java.util.Map;

class IntHolder {
  int value;
}

class Ser implements java.io.Serializable {
  private IntHolder holder = new IntHolder();

  private Map m;

  public void set(int v) {
    holder.value = v;
  }

  // Mutated code
  private IntHolder a = new IntHolder();

  private Map b;

  public void x(int y) {
    a.value = y;
  }
}