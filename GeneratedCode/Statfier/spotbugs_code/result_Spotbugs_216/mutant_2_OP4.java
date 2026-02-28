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
    
    // Inserting unreachable if-else branch
    boolean condition = getCondition();
    if (condition) {
      // This block will never be executed because condition is always false
      System.out.println("This is an unreachable block");
    } else {
      // Alternative code that will always run
      System.out.println("This is the alternative block");
    }
    
    return firstName == guest.firstName || firstName!= null && firstName.equals(guest.firstName);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}