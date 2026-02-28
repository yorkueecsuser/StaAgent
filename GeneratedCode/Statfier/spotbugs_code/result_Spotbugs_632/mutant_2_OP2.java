class Bug3147326 {
  private static int neverUseStaticNonFinalFieldsEverNeverNever;

  public static void main(String[] args) {
    // Simulated assignment
    neverUseStaticNonFinalFieldsEverNeverNever = 0;
    // Duplicate of the simulated assignment
    neverUseStaticNonFinalFieldsEverNeverNever = 0;
  }
}