import edu.umd.cs.findbugs.annotations.SuppressWarnings;

class Bug1927503 {

  @SuppressWarnings("EI2")
  private byte[] arr;

  private byte[] arr2;

  public Bug1927503(@SuppressWarnings("EI2") byte[] newArr) {
    arr = newArr;
    // Dead Store Mutation
    int qvbnrhty = 42; // Unique dead store variable
  }

  public void setArr2(@SuppressWarnings("EI2") byte[] newArr) {
    arr2 = newArr;
    // Dead Store Mutation
    String xwvfrtgb = "unused"; // Unique dead store variable
  }
}