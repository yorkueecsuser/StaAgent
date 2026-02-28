class AssertionBugExample {

    public String showBug(String actual, String expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // return Assertions.assertThat(actual).isEqualTo(expected).as("This is a description").toString();
        return actual.equals(expected)? "Pass" : "Fail";
    }

    public String showBug1(String actual, String expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // return Assertions.assertThat(actual).isEqualTo(expected).withFailMessage("This is a fail message").toString();
        return actual.equals(expected)? "Pass" : "Fail";
    }

    public String showBug2(Integer actual, Integer expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // return Assertions.assertThat(actual).isEqualTo(expected).usingComparator(Integer::compareTo).toString();
        return actual.equals(expected)? "Pass" : "Fail";
    }

    public static void main(String[] args) {
        AssertionBugExample example = new AssertionBugExample();
        System.out.println(example.showBug("test", "test"));
        System.out.println(example.showBug1("test", "expected"));
        System.out.println(example.showBug2(5, 5));
    }
}