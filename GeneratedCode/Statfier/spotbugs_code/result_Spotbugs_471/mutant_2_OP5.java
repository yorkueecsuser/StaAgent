import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        System.out.println("This will never be printed");
        break;
    }
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    
    // Introduced unreachable switch statement
    boolean alwaysFalse = getAlwaysFalse();
    switch (alwaysFalse) {
      case true:
        // This case is unreachable
        System.out.println("This will never be printed");
        break;
    }
  }

  private boolean getAlwaysFalse() {
    return false;
  }
}