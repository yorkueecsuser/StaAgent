class EI2 {

  EI2[] myArray;

  public void setStuff(EI2[] myArray) {
    if (myArray.length > 0) this.myArray = myArray;
  }

  // Mutant code with renaming mutation operator
  EI2[] a;

  public void setStuff(EI2[] a) {
    if (a.length > 0) this.a = a;
  }

  public static void main(String[] args) {}
}