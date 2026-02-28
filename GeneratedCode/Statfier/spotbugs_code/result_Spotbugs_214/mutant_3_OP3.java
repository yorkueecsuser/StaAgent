import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Bug2912638 {

  private String name;

  public void setName(String _name) {
    name = _name;
  }

  public String getName() {
    return name;
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest(Bug2912638 person) {
    String value = person.getName();

    if ("FOO" == value) System.out.println("a");
    else System.out.println("a3");
    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");

    // Mutant: Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    }
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest2(Bug2912638 person) {
    String value = person.getName();

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");

    // Mutant: Inserting an unreachable if statement
    boolean condition2 = getAnotherCondition();
    if (condition2) {
      System.out.println("This is another unreachable if statement");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition that is always false
  private static boolean getAnotherCondition() {
    return false;
  }
}