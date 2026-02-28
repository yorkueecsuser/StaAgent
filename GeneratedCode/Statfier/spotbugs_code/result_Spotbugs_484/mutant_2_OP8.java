class EI2 {

  EI2[] myArray;

  public void setStuff(EI2[] myArray) {
    if (myArray.length > 0) this.myArray = myArray;
  }

  // Mutated code
  EI2[] b;

  public void setStuff(EI2[] b) {
    if (b.length > 0) this.b = b;
  }

  public static void main(String[] args) {}
}