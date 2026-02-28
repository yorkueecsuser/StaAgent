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

    // Mutated code
    String x = person.getName();
    if ("BAR" == x) System.out.println("b");
    else System.out.println("b3");
    if (x == "BAR") System.out.println("b");
    else System.out.println("b3");
  }

  @ExpectWarning("ES_COMPARING_STRINGS_WITH_EQ")
  protected static void findBugsTest2(Bug2912638 person) {
    String value = person.getName();

    if (value == "FOO") System.out.println("a");
    else System.out.println("a3");

    // Mutated code
    String y = person.getName();
    if (y == "BAZ") System.out.println("c");
    else System.out.println("c3");
  }
}