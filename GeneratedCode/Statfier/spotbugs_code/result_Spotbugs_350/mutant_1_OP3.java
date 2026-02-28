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

    // Mutant code: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  private static boolean getCondition() {
    return false; // This method will always return false, making the if statement unreachable
  }
}