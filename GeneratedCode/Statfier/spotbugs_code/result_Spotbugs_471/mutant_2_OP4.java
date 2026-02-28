import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in constructor");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in constructor");
    }
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    boolean condition = getCondition();
    if (condition) {
      // Some unreachable code
      System.out.println("This is unreachable code in setArr2");
    } else {
      // Alternative unreachable code
      System.out.println("This is alternative unreachable code in setArr2");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}