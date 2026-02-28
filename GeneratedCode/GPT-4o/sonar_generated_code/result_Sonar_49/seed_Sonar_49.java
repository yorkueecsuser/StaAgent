class AssertionContextBugDemo {

    public void showBug(Object actual, Object expected) {
        // Demonstrating the bug where assertion context methods are called after an assertion

        // Incorrect: Setting the description after the assertion
        assertThat(actual, expected, "This should describe the assertion context"); // BUG: AssertJ methods setting the assertion context should come before an assertion

        // Incorrect: Setting a failure message after the assertion
        assertThatWithFailMessage(actual, expected, "This should be the fail message"); // BUG: AssertJ methods setting the assertion context should come before an assertion
    }

    private boolean assertThat(Object actual, Object expected, String description) {
        boolean result = actual.equals(expected);
        if (!result) {
            System.out.println(description);
        }
        return result;
    }
    
    private boolean assertThatWithFailMessage(Object actual, Object expected, String failMessage) {
        boolean result = actual.equals(expected);
        if (!result) {
            System.out.println(failMessage);
        }
        return result;
    }

    public static void main(String[] args) {
        AssertionContextBugDemo demo = new AssertionContextBugDemo();
        demo.showBug("actualValue", "expectedValue");
    }
}