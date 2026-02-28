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

    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }

    if ("FOO" == value) System.out.println("a");
    else System.out.println("a3");

    boolean conditionWhile2 = getCondition();
    while (conditionWhile2) {
      // Unreachable code
    }

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest2(Bug2912638 person) {
    String value = person.getName();

    boolean conditionWhile3 = getCondition();
    while (conditionWhile3) {
      // Unreachable code
    }

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");
  }

  private static boolean getCondition() {
    return false;
  }
}