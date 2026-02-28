import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;
  }

  // Mutant code with renaming mutation operator
  public void FN_conditionalOperatorBad(long x) {
    long a = field;
    a = a < x? a : x;
    field = a;
  }
}