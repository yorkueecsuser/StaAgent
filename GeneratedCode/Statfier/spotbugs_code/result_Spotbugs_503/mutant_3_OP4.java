import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

public abstract class StrictTest {

  protected abstract void requiresStrict(@Strict Object o);

  protected abstract Object get();

  protected abstract @Strict Object getStrict();

  @Strict Object f;

  @Strict Object f2;

  Object g;

  private boolean getCondition() {
    return false;
  }

  @NoWarning("TQ")
  public @Strict Object coercionFunction(Object unknown) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = unknown;
    } else {
      // Alternative unreachable code
      f2 = unknown;
    }
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = unknown;
    } else {
      // Alternative unreachable code
      f2 = unknown;
    }
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      requiresStrict(unknown);
    } else {
      // Alternative unreachable code
      requiresStrict(f);
    }
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return g;
    } else {
      // Alternative unreachable code
      return f;
    }
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = g;
    } else {
      // Alternative unreachable code
      f2 = g;
    }
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      requiresStrict(g);
    } else {
      // Alternative unreachable code
      requiresStrict(f);
    }
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return get();
    } else {
      // Alternative unreachable code
      return getStrict();
    }
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = get();
    } else {
      // Alternative unreachable code
      f2 = get();
    }
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      requiresStrict(get());
    } else {
      // Alternative unreachable code
      requiresStrict(getStrict());
    }
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return f;
    } else {
      // Alternative unreachable code
      return f2;
    }
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = f2;
    } else {
      // Alternative unreachable code
      f2 = f;
    }
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      requiresStrict(f);
    } else {
      // Alternative unreachable code
      requiresStrict(f2);
    }
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return g;
    } else {
      // Alternative unreachable code
      return f;
    }
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = g;
    } else {
      // Alternative unreachable code
      f2 = g;
    }
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      requiresStrict(g);
    } else {
      // Alternative unreachable code
      requiresStrict(f);
    }
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      return get();
    } else {
      // Alternative unreachable code
      return getStrict();
    }
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      f = get();
    } else {
      // Alternative unreachable code
      f2 = get();
    }
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      requiresStrict(get());
    } else {
      // Alternative unreachable code
      requiresStrict(getStrict());
    }
    requiresStrict(getStrict());
  }
}