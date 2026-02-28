class Bug1864793 {

  public Bug1864793(String data_source_directory) {

    // ----------------------------------------------------------------

    // Example 1 -- issue

    if (data_source_directory == null) {
      // *boum*
    }
    this.data_source_directory = data_source_directory;

    /*
     * FindBugs reports (line 9): Bad practice -> - sing == or!= ->
     * Comparison of String parameter using == or!= -> Comparison of String
     * parameter using == or!=
     * "[...] Consider using the equals(Object) method instead."
     *
     * while it should maybe report: Bad Practice -> Suspicious reference
     * comparison -> Suspicious reference comparison
     *
     * But at the very least, the point here is that == can indeed be used.
     */

    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    // ----------------------------------------------------------------

    // Example 2 -- maybe an issue?

    String s = "hi!";

    if (s == null) {
      // *boum*
    }

    /*
     * FindBugs reports nothing...
     *
     * while it should maybe report: Bad Practice -> Suspicious reference
     * comparison -> Suspicious reference comparison
     */

    // Inserting unreachable while loop
    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }

    // ----------------------------------------------------------------

    // To avoid unrelated warning "Unread field"...
    System.out.println(this.data_source_directory);
  }

  public static void main(String[] args) {

    new Bug1864793("bar");
  }

  private String data_source_directory;

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}