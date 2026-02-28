import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;
  }

  // Mutated code with renaming operator
  public void FN_conditionalOperatorBad(long x) {
    long a = field;
    long b = v;
    a = a < b? a : b;
    field = a;
  }
}