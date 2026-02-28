import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

public abstract class StrictTest {

  protected abstract void requiresStrict(@Strict Object o);

  protected abstract Object get();

  protected abstract @Strict Object getStrict();

  @Strict Object f;

  @Strict Object f2;

  Object g;

  @NoWarning("TQ")
  public @Strict Object coercionFunction(Object unknown) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    boolean conditionWhile = getCondition();
    while (conditionWhile) { /* unreachable code */ }
    requiresStrict(getStrict());
  }

  private boolean getCondition() {
    return false;
  }
}