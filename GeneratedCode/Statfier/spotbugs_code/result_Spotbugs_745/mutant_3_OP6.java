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

    // ----------------------------------------------------------------

    // To avoid unrelated warning "Unread field"...
    System.out.println(this.data_source_directory);

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
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