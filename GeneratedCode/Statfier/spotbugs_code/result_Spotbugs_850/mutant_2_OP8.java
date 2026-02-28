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
    }

    @ExpectWarning("NP")
    Object ai2() {
      return get(null);
    }

    static class AN implements I.N {}
  }

  // Mutated code
  void x(ACSI z) {
    z.get().toString();
  }

  static class C {
    @CheckForNull
    Object c() {
      return null;
    }
  }

  static class D extends C {
    @Override
    String c() {
      return "D";
    }

    @ExpectWarning("NP")
    int d() {
      return c().hashCode();
    }
  }

  static interface J<K, V extends J.M> {
    @CheckForNull
    V get();

    @CheckForNull
    V get(@Nonnull K k);

    interface M {}
  }

  static interface TI<K, V> {
    @CheckForNull
    public V get();
  }

  static interface CSJ<K, V> extends TI<K, Collection<V>> {
    @Nonnull
    @Override
    public Collection<V> get();
  }

  static class ACSJ implements CSJ<Object, String> {

    @ExpectWarning("NP")
    @Override
    public Collection<String> get() {
      return null;
    }
  }

  static class AJ implements J<String, AJ.AM> {
    @Override
    public AM get(String l) {
      return null;
    }

    @Override
    public AM get() {
      return null;
    }

    @ExpectWarning("NP")
    int aj() {
      return get().hashCode();
    }

    @ExpectWarning("NP")
    Object aj2() {
      return get(null);
    }

    static class AM implements J.M {}
  }
}