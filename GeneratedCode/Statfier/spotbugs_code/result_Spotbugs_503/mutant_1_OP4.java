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
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(getStrict());
  }
}