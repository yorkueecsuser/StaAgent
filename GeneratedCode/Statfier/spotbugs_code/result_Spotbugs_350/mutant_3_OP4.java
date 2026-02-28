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

    // Mutant code added here
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable if block.");
    } else {
      // This block will also never execute because the if condition is always false
      System.out.println("This is an unreachable else block.");
    }
  }

  // Method to simulate a condition that always returns false
  private static boolean getCondition() {
    return false;
  }
}