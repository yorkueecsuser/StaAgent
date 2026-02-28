import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
  }

  // Mutated code
  @SuppressWarnings("EI2")
  private byte[] b;

  private byte[] c;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newB) {
    b = newB;
  }

  public void setC(@SuppressWarnings("EI2") byte[] newC) {
    c = newC;
  }
}