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
    return firstName == guest.firstName || firstName!= null && firstName.equals(guest.firstName);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This will never be printed");
        break;
      case 1:
        // This case is also unreachable because condition is never true
        System.out.println("This will also never be printed");
        break;
    }
  }

  private boolean getCondition() {
    // This method returns false, making the switch statement unreachable
    return false;
  }
}