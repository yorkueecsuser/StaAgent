import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      arr = new byte[0];
    }
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() will always return false
      arr2 = new byte[0];
    }
  }

  private boolean getCondition() {
    return false;
  }
}