import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    // Dead store mutation
    int qwertyui = 42;
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    // Dead store mutation
    String asdfghjk = "unused";
  }
}