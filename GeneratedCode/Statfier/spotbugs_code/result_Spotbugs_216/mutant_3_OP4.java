class Ideas_2012_05_21 {

  String firstName;

  public Ideas_2012_05_21(String firstName) {
    this.firstName = firstName;
  }

  @Override
  public int hashCode() {
    return firstName.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Ideas_2012_05_21)) return false;
    Ideas_2012_05_21 guest = (Ideas_2012_05_21) obj;
    
    // Introduced an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because getCondition() always returns false
      System.out.println("This is an unreachable block");
    } else {
      // This block will always be executed
      System.out.println("This block is always executed");
    }
    
    return firstName == guest.firstName || firstName!= null && firstName.equals(guest.firstName);
  }

  private boolean getCondition() {
    // Always returns false to ensure the if block is unreachable
    return false;
  }
}