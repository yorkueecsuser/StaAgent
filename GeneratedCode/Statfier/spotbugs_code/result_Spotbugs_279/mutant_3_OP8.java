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
  private IntHolder x = new IntHolder();

  private Map n;

  public void a(int b) {
    x.value = b;
  }
}