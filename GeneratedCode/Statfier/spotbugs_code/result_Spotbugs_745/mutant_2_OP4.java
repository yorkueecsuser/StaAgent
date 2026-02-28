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

    // Mutant code: Inserting an unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This will never print");
    } else {
      // This block will always execute
      System.out.println("This will always print");
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