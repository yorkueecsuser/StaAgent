class Bug1933930 {
  // public static final String US_ENGLISH_MAPPING_STRING = "";
  // public static final char[] US_ENGLISH_MAPPING =
  // US_ENGLISH_MAPPING_STRING.toCharArray();

  public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";

  /**
   * This is a default mapping of the 26 letters used in US English. A value of <code>0</code> for a
   * letter position means do not encode.
   */
  public static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(US_ENGLISH_MAPPING);

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse) {
      case true:
        System.out.println("This will never be printed");
        break;
      default:
        System.out.println("Default case, also never reached");
        break;
    }
  }

  private static boolean getCondition() {
    return false;
  }
}