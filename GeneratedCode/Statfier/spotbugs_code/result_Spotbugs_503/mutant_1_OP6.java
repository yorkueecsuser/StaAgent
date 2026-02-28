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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() should return false
    }
    requiresStrict(getStrict());
  }

  private boolean getCondition() {
    return false; // This method ensures the loop condition is false
  }
}