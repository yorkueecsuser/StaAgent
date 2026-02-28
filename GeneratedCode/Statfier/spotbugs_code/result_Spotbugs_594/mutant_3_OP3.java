import edu.umd.cs.findbugs.annotations.ExpectWarning;

/**
 * See if FindBugs does the right thing when a method with an inherited strict parameter annotation
 * is called, passing an UNKNOWN value as the argument. This is hard to check because the method
 * containing the violation does not have any obvious annotations.
 */
class TrickyInheritedQualifiers {
  static class X {
    public void f(@Strict Object p) {}
  }

  static class Y extends X {
    //
    // NOTE: @Strict annotation on parameter p should be
    // inherited from overridden superclass method
    //
    @Override
    public void f(Object p) {
      boolean condition = getCondition();
      if (condition) {
        // This is an unreachable if statement due to the condition always being false at runtime
        System.out.println("This is an unreachable statement.");
      }
    }
  }

  @ExpectWarning("TQ")
  public void violateEasy(X x, Object q) {
    //
    // An easy-to-check violation: X.f() is directly
    // annotated with @Strict, and it is passed
    // a non-@Strict (when=UNKNOWN) value.
    //
    x.f(q);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement due to the condition always being false at runtime
      System.out.println("This is an unreachable statement.");
    }
  }

  @ExpectWarning("TQ")
  public void violateTricky(Y y, Object q) {
    //
    // This is a violation:
    // value q, not annotated with the @Strict annotation
    // (and thus effectively when=UNKNOWN)
    // is passed to a method requiring a @Strict (when=ALWAYS) value.
    //
    y.f(q);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement due to the condition always being false at runtime
      System.out.println("This is an unreachable statement.");
    }
  }

  //
  // This violation is easier to find because the (irrelevant) annotation
  // on parameter "r" informs FindBugs that the @Strict annotation needs
  // to be checked.
  //
  @ExpectWarning("TQ")
  public void violateWorksAccidentally(Y y, Object q, @Strict Object r) {
    y.f(q);
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement due to the condition always being false at runtime
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}