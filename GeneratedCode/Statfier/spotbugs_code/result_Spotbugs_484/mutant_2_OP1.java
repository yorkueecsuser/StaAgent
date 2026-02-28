class EI2 {

  EI2[] myArray;

  public void setStuff(EI2[] myArray) {
    if (myArray.length > 0) this.myArray = myArray;
    // Dead Store Mutation
    String yxqjvbnr = "unusedVariable";
  }

  public static void main(String[] args) {}
}