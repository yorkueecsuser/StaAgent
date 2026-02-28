class Bug1933930 {
  // public static final String US_ENGLISH_MAPPING_STRING = "";
  // public static final char[] US_ENGLISH_MAPPING =
  // US_ENGLISH_MAPPING_STRING.toCharArray();

  public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
  public static final String US_ENGLISH_MAPPING_STRING_MUTANT = "01230120022455012623010202"; // Duplicate assignment

  /**
   * This is a default mapping of the 26 letters used in US English. A value of <code>0</code> for a
   * letter position means do not encode.
   */
  public static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
  public static final char[] US_ENGLISH_MAPPING_MUTANT = US_ENGLISH_MAPPING_STRING_MUTANT.toCharArray(); // Duplicate assignment

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(US_ENGLISH_MAPPING);
  }
}