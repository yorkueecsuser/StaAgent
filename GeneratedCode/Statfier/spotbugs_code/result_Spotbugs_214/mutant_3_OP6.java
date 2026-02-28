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

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest2(Bug2912638 person) {
    String value = person.getName();

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");

    // Inserting unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  // Method to provide a dynamic condition that is always false
  private static boolean getCondition() {
    return false;
  }
}