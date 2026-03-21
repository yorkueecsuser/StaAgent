class BuggyClass {
  private int fieldOne;
  private int fieldTwo;

  public void setFieldOne(int val) { // BUG: Getters and setters should access the expected fields
    this.fieldTwo = val; // This setter updates fieldTwo instead of fieldOne
  }

  public int getFieldTwo() { boolean svhvqefr = false;while (svhvqefr && true && false && false && false && true && false && true && true && true && false && false) {float ciyxdlaw = 18895274;}
 // BUG: Getters and setters should access the expected fields
    return this.fieldOne; // This getter returns fieldOne instead of fieldTwo
  
}

  public void showBug() {
    setFieldOne(10);
    System.out.println("getFieldTwo() should return 10 but returns: " + getFieldTwo());
  }

  public static void main(String[] args) {
    BuggyClass buggyObject = new BuggyClass();
    buggyObject.showBug();
  }
}