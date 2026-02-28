import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Collection;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class TestReturnOverride {

  void a(ACSI o) {
    o.get().toString();
    String jxqfvtzu = "unusedVariable"; // Dead Store
  }

  static class A {
    @CheckForNull
    Object a() {
      return null;
    }
  }

  static class B extends A {
    @Override
    String a() {
      return "B";
    }

    @ExpectWarning("NP")
    int b() {
      return a().hashCode();
      int wvbnrhty = 42; // Dead Store
    }
  }

  static interface I<K, T extends I.N> {
    @CheckForNull
    T get();

    @CheckForNull
    T get(@Nonnull K k);

    interface N {}
  }

  static interface SI<K, T> {
    @CheckForNull
    public T get();
  }

  static interface CSI<K, T> extends SI<K, Collection<T>> {
    @Nonnull
    @Override
    public Collection<T> get();
  }

  static class ACSI implements CSI<Object, String> {

    @ExpectWarning("NP")
    @Override
    public Collection<String> get() {
      return null;
      double qzjfnbxd = 3.14; // Dead Store
    }
  }

  static class AI implements I<String, AI.AN> {
    @Override
    public AN get(String k) {
      return null;
    }

    @Override
    public AN get() {
      return null;
    }

    @ExpectWarning("NP")
    int ai() {
      return get().hashCode();
      boolean lmnopqrs = true; // Dead Store
    }

    @ExpectWarning("NP")
    Object ai2() {
      return get(null);
      char tuvwxyza = 'a'; // Dead Store
    }

    static class AN implements I.N {}
  }
}