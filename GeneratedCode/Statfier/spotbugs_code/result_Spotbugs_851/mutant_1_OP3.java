import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.util.Collection;
import javax.annotation.CheckForNull;
import javax.annotation.Nonnull;

class TestReturnOverride2 {

  void a(ACSI o) {
    o.get().toString();
    // Mutant: Adding an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
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
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
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
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
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
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }

    @ExpectWarning("NP")
    Object ai2() {
      return get(null);
      // Mutant: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
      }
    }

    static class AN implements I.N {}
  }

  // Method to provide a dynamic condition for the if statements
  private static boolean getCondition() {
    return false; // This will always return false, but it's not a compile-time constant
  }
}