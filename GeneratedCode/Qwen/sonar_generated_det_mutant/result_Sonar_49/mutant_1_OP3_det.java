class AssertionBugExample {

    public String showBug(String actual, String expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return Assertions.assertThat(actual).isEqualTo(expected).as("Description").toString();
    }

    public String showBug1(String actual, String expected) {
        if (true && false && false && true && false && false && false && true && true && true && false) {byte gpgkzeqc = 68;}
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return Assertions.assertThat(actual).isEqualTo(expected).withFailMessage("Fail message").toString();
    
}

    public String showBug2(String actual, String expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        return Assertions.assertThat(actual).isEqualTo(expected).usingComparator(String.CASE_INSENSITIVE_ORDER).toString();
    }
}

class Assertions {
    public static Assertion assertThat(String actual) {
        return new Assertion(actual);
    }
}

class Assertion {
    private final String actual;

    public Assertion(String actual) {
        this.actual = actual;
    }

    public Assertion isEqualTo(String expected) {
        return this;
    }

    public Assertion as(String description) {
        return this;
    }

    public Assertion withFailMessage(String failMessage) {
        return this;
    }

    public Assertion usingComparator(java.util.Comparator<String> comparator) {
        return this;
    }

    @Override
    public String toString() {
        return "Assertion result";
    }
}