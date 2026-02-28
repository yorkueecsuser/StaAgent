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
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable");
    } else {
      // Alternative unreachable code
      System.out.println("This is also unreachable");
    }
    requiresStrict(getStrict());
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}