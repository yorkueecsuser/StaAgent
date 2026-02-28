class EI2 {

  EI2[] myArray;

  public void setStuff(EI2[] myArray) {
    if (myArray.length > 0) this.myArray = myArray;
    
    // Introduced an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      // This block is unreachable because getCondition() always returns false
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the if block unreachable
  }

  public static void main(String[] args) {}
}