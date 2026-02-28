final class ProtectedMemberOfFinalClass {
  protected int foo;
  protected int a; // Mutant: Renamed 'foo' to 'a'

  protected void bar() {}

  protected void b() {} // Mutant: Renamed 'bar' to 'b'
}