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
    return unknown;
  }

  @ExpectWarning("TQ")
  public void violation2(Object unknown) {
    f = unknown;
  }

  @ExpectWarning("TQ")
  public void violation3(Object unknown) {
    requiresStrict(unknown);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation4() {
    return g;
  }

  @ExpectWarning("TQ")
  public void violation5() {
    f = g;
  }

  @ExpectWarning("TQ")
  public void violation6() {
    requiresStrict(g);
  }

  @ExpectWarning("TQ")
  public @Strict Object violation7() {
    return get();
  }

  @ExpectWarning("TQ")
  public void violation8() {
    f = get();
  }

  @ExpectWarning("TQ")
  public void violation9() {
    requiresStrict(get());
  }

  @NoWarning("TQ")
  public @Strict Object ok1DoNotReport(@Strict Object s) {
    return s;
  }

  @NoWarning("TQ")
  public void ok2DoNotReport(@Strict Object s) {
    f = s;
  }

  @NoWarning("TQ")
  public void ok3DoNotReport(@Strict Object s) {
    requiresStrict(s);
  }

  @NoWarning("TQ")
  public @Strict Object ok4DoNotReport() {
    return f;
  }

  @NoWarning("TQ")
  public void ok5DoNotReport() {
    f2 = f;
  }

  @NoWarning("TQ")
  public void ok6DoNotReport() {
    requiresStrict(f);
  }

  @NoWarning("TQ")
  public @Strict Object ok7DoNotReport() {
    return getStrict();
  }

  @NoWarning("TQ")
  public void ok8DoNotReport() {
    f = getStrict();
  }

  @NoWarning("TQ")
  public void ok9DoNotReport() {
    requiresStrict(getStrict());
  }

  // Mutated code
  protected abstract void requiresStrict(@Strict Object a);

  protected abstract Object b();

  protected abstract @Strict Object c();

  @Strict Object d;

  @Strict Object e;

  Object h;

  @NoWarning("TQ")
  public @Strict Object i(Object j) {
    return j;
  }

  @ExpectWarning("TQ")
  public void k(Object l) {
    d = l;
  }

  @ExpectWarning("TQ")
  public void m(Object n) {
    requiresStrict(n);
  }

  @ExpectWarning("TQ")
  public @Strict Object o() {
    return h;
  }

  @ExpectWarning("TQ")
  public void p() {
    d = h;
  }

  @ExpectWarning("TQ")
  public void q() {
    requiresStrict(h);
  }

  @ExpectWarning("TQ")
  public @Strict Object r() {
    return b();
  }

  @ExpectWarning("TQ")
  public void s() {
    d = b();
  }

  @ExpectWarning("TQ")
  public void t() {
    requiresStrict(b());
  }

  @NoWarning("TQ")
  public @Strict Object u(@Strict Object v) {
    return v;
  }

  @NoWarning("TQ")
  public void w(@Strict Object x) {
    d = x;
  }

  @NoWarning("TQ")
  public void y(@Strict Object z) {
    requiresStrict(z);
  }

  @NoWarning("TQ")
  public @Strict Object aa() {
    return d;
  }

  @NoWarning("TQ")
  public void ab() {
    e = d;
  }

  @NoWarning("TQ")
  public void ac() {
    requiresStrict(d);
  }

  @NoWarning("TQ")
  public @Strict Object ad() {
    return c();
  }

  @NoWarning("TQ")
  public void ae() {
    d = c();
  }

  @NoWarning("TQ")
  public void af() {
    requiresStrict(c());
  }
}