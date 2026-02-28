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
    String qzjfnxrb = "unused"; // Dead Store
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    int xqjfnxrb = 42; // Dead Store
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    boolean wqjfnxrb = true; // Dead Store
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    char vqjfnxrb = 'a'; // Dead Store
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    double uqjfnxrb = 3.14; // Dead Store
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    long tqjfnxrb = 100L; // Dead Store
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    float sqjfnxrb = 2.71f; // Dead Store
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    short rqjfnxrb = 10; // Dead Store
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    byte pqjfnxrb = 1; // Dead Store
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    String oqjfnxrb = "unused"; // Dead Store
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    int nqjfnxrb = 42; // Dead Store
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    boolean mqjfnxrb = true; // Dead Store
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    char lqjfnxrb = 'a'; // Dead Store
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    double kqjfnxrb = 3.14; // Dead Store
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    long jqjfnxrb = 100L; // Dead Store
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    float iqjfnxrb = 2.71f; // Dead Store
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    short hqjfnxrb = 10; // Dead Store
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    byte gqjfnxrb = 1; // Dead Store
    requiresStrict(getStrict());
  }
}