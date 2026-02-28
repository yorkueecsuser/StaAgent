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

    // Mutant: Adding an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable if statement");
    } else {
      System.out.println("This is an unreachable else statement");
    }
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest2(Bug2912638 person) {
    String value = person.getName();

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");

    // Mutant: Adding an unreachable if-else statement
    boolean condition2 = getCondition2();
    if (condition2) {
      System.out.println("This is another unreachable if statement");
    } else {
      System.out.println("This is another unreachable else statement");
    }
  }

  // Method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }

  // Another method to provide a different dynamic condition
  private static boolean getCondition2() {
    return false;
  }
}