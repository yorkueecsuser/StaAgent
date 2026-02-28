import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
    }
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if statements unreachable
  }
}