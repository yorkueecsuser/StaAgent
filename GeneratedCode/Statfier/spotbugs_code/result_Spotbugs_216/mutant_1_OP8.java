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
  }

  // Mutated code
  String a;

  public Ideas_2012_05_21(String a) {
    this.a = a;
  }

  @Override
  public int hashCode() {
    return a.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Ideas_2012_05_21)) return false;
    Ideas_2012_05_21 b = (Ideas_2012_05_21) obj;
    return a == b.a || a!= null && a.equals(b.a);
  }
}