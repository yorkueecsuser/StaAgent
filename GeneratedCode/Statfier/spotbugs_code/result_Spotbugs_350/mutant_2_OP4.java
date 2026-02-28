import org.easymock.EasyMock;

class Ideas_2008_11_24 {
  interface Foo {
    void setFoo(int x);
  }

  public static void main(String args[]) {
    Foo foo = EasyMock.createMock(Foo.class);
    foo.setFoo(5);
    EasyMock.replay();
    foo.setFoo(4);
    EasyMock.verify();

    // Mutant code starts here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      System.out.println("This will run if shouldRun is true");
    } else {
      // This is an unreachable if-else branch
      System.out.println("This will never run because shouldRun is always false");
    }
  }

  private static boolean getCondition() {
    return false;
  }
}