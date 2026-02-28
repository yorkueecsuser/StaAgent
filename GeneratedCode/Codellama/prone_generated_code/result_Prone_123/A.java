import java.lang.annotation.Target;

class A {
  @Target(TYPE_USE)
  @interface Nullable {}

  class B {}
  static class C {}

  void test(A.@Nullable B x) {} // B is annotated ('A' is the enclosing instance type)
  void test(A.@Nullable C x) {} // C is annotated ('A' is a'scoping construct' here)
}

void test(@Nullable A.B x) {} // compiles, but likely incorrect: annotates the enclosing instance type 'A', which can never be null
void test(@Nullable A.C x) {} // compile error: 'A' cannot be annotated

void showBug(A a) {
  a.test(new A.B()); // BUG: NullableOnContainingClass
}