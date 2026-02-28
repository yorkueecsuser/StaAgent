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

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed");
    } else {
      System.out.println("This will also never be printed");
    }
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest2(Bug2912638 person) {
    String value = person.getName();

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");

    // Inserted unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This will never be printed either");
    } else {
      System.out.println("This will also never be printed either");
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}