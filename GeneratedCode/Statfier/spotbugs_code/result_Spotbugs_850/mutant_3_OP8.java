import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Collection;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class TestReturnOverride {

  void a(ACSI o) {
    o.get().toString();
  }

  static class A {
    @CheckForNull
    Object x() { // Renamed 'a' to 'x'
      return null;
    }
  }

  static class B extends A {
    @Override
    String x() { // Renamed 'a' to 'x'
      return "B";
    }

    @ExpectWarning("NP")
    int b() {
      return x().hashCode();
    }
  }

  static interface I<K, T extends I.N> {
    @CheckForNull
    T y(); // Renamed 'get' to 'y'

    @CheckForNull
    T y(@Nonnull K k); // Renamed 'get' to 'y'

    interface N {}
  }

  static interface SI<K, T> {
    @CheckForNull
    public T z(); // Renamed 'get' to 'z'
  }

  static interface CSI<K, T> extends SI<K, Collection<T>> {
    @Nonnull
    @Override
    public Collection<T> z(); // Renamed 'get' to 'z'
  }

  static class ACSI implements CSI<Object, String> {

    @ExpectWarning("NP")
    @Override
    public Collection<String> z() { // Renamed 'get' to 'z'
      return null;
    }
  }

  static class AI implements I<String, AI.AN> {
    @Override
    public AN y(String k) { // Renamed 'get' to 'y'
      return null;
    }

    @Override
    public AN y() { // Renamed 'get' to 'y'
      return null;
    }

    @ExpectWarning("NP")
    int ai() {
      return y().hashCode();
    }

    @ExpectWarning("NP")
    Object ai2() {
      return y(null);
    }

    static class AN implements I.N {}
  }
}