class AssertJBug {
    private boolean getFalseCondition() {
        return false;
    }

    public String showBug() {
        String actual = "actual";
        String expected = "expected";

        // BUG: AssertJ methods setting the assertion context should come before an assertion
        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            int value = 1;
            switch(value) {
                case 1:
                    System.out.println("This should not be printed");
                    break;
            }
        }

        return actual.equals(expected)? "No error" : "Description";
    }
}