import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    arr = newArr; // Mutation: duplicated assignment
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    arr2 = newArr; // Mutation: duplicated assignment
  }
}