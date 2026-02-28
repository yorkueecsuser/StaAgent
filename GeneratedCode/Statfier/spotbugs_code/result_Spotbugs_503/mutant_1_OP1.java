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
    String qjvbnrht = "unused";
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    int wxyzabcd = 0;
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    double efghijkl = 1.0;
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    booleanmnopqr = true;
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    char stuvwxYZ = 'a';
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    byte abcdEFGH = 1;
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    short IJKLmnop = 2;
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    long qrstUVWX = 3L;
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    float yzABCDef = 4.0f;
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    String pqrsTUVW = "used";
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    int tuvwXYZA = 5;
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    double bcdeFGHI = 6.0;
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    boolean jklmNOPQ = false;
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    char rstuVWXY = 'b';
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    byte cdefGHIJ = 7;
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    short KLMNopqr = 8;
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    long mnopQRST = 9L;
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    float uvwxYZAB = 10.0f;
    requiresStrict(getStrict());
  }
}