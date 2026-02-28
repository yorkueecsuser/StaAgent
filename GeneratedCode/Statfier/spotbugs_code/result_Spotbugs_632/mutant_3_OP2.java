class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNeverEver;

  public static void main(String[] args) {
    // Introducing an assignment statement for demonstration
    neverUseStaticNonFinalFieldsEverNeverNeverEver = 0;
    // Duplicating the assignment statement immediately after its current location
    neverUseStaticNonFinalFieldsEverNeverNeverEver = 0;
  }
}