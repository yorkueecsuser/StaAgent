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
    
    // Inserting unreachable if branch
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      // This block is unreachable
      System.out.println("This is an unreachable block");
    }
    
    return firstName == guest.firstName || firstName!= null && firstName.equals(guest.firstName);
  }

  private boolean getUnreachableCondition() {
    return false; // This method always returns false, making the condition effectively unreachable
  }
}