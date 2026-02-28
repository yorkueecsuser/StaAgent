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
    String qwerasdf = "deadstore"; // Dead Store mutation
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    f = unknown;
    int abcdefgh = 42; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    requiresStrict(unknown);
    double hijklmno = 3.14; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    return g;
    boolean pqrstuvw = true; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public void violation5() {
    f = g;
    char xyzabcde = 'x'; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public void violation6() {
    requiresStrict(g);
    long fedcbazy = 123456789L; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    return get();
    float vutrhsdc = 0.5f; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public void violation8() {
    f = get();
    short wertyuio = 100; // Dead Store mutation
  }

  @ExpectWarning("TQ")
  public void violation9() {
    requiresStrict(get());
    byte mnbvcxz = 10; // Dead Store mutation
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    return s;
    String lkjhgfdsa = "ok1"; // Dead Store mutation
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    f = s;
    int poiuytrew = 200; // Dead Store mutation
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    requiresStrict(s);
    double mnvbgtyhu = 2.718; // Dead Store mutation
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    return f;
    boolean jklpoiuy = false; // Dead Store mutation
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    f2 = f;
    char hgfdsazxc = 'y'; // Dead Store mutation
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    requiresStrict(f);
    long tzxcvbnml = 987654321L; // Dead Store mutation
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    return getStrict();
    float qwertyui = 0.75f; // Dead Store mutation
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    f = getStrict();
    short asdfghjk = 200; // Dead Store mutation
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    requiresStrict(getStrict());
    byte poiuytfr = 20; // Dead Store mutation
  }
}