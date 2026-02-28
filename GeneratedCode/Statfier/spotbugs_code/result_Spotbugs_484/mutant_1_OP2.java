class EI2 {

  EI2[] myArray;

  public void setStuff(EI2[] myArray) {
    if (myArray.length > 0) this.myArray = myArray;
    if (myArray.length > 0) this.myArray = myArray; // Mutant: duplicated assignment statement
  }

  public static void main(String[] args) {}
}