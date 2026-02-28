class EI2 {

  EI2[] myArray;

  public void setStuff(EI2[] myArray) {
    if (myArray.length > 0) this.myArray = myArray;
    
    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block is intended to be unreachable
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code
      System.out.println("This is the alternative block");
    }
  }

  private boolean getCondition() {
    // This method returns false, making the if-block unreachable
    return false;
  }

  public static void main(String[] args) {}
}