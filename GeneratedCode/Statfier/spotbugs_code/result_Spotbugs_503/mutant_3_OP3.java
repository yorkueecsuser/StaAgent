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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = unknown;
    }
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = unknown;
    }
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      requiresStrict(unknown);
    }
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return g;
    }
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = g;
    }
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      requiresStrict(g);
    }
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return get();
    }
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = get();
    }
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      requiresStrict(get());
    }
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return s;
    }
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = s;
    }
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      requiresStrict(s);
    }
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return f;
    }
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f2 = f;
    }
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      requiresStrict(f);
    }
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      return getStrict();
    }
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      f = getStrict();
    }
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      requiresStrict(getStrict());
    }
    requiresStrict(getStrict());
  }

  private boolean getCondition() {
    return false; // This method will always return false, making the if blocks unreachable
  }
}