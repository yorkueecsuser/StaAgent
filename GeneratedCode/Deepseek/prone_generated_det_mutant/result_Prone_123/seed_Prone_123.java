import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// BUG: NullableOnContainingClass
@Target(ElementType.TYPE_USE)
@interface Nullable {}

class A {
  class B {}
  static class C {}

  void test(A.@Nullable B x) {} // B is annotated ('A' is the enclosing instance type)
  void test(A.@Nullable C x) {} // C is annotated ('A' is a'scoping construct' here)
  void test(@Nullable A.B x) {} // compiles, but likely incorrect: annotates the enclosing instance type 'A', which can never be null
  void test(@Nullable A.C x) {} // compile error: 'A' cannot be annotated
  public Nullable showBug(A.@Nullable B x) {
    return x;
  }
  public Nullable showBug(A.@Nullable C x) {
    return x;
  }
  public Nullable showBug(@Nullable A.B x) {
    return x;
  }
  public Nullable showBug(@Nullable A.C x) {
    return x;
  }
}