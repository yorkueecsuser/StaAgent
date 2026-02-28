import javax.annotation.concurrent.ThreadSafe;

// TODO fix FN T38248006
@ThreadSafe
class NonSourceVar {
  private long field;

  public void FN_conditionalOperatorBad(long v) {
    field = field < v? field : v;
  }

  // Mutated code with renaming mutation operator
  private long a;

  public void b(long c) {
    a = a < c? a : c;
  }
}