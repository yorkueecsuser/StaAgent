class AssertJBugExample {
    public String showBug(String actual, String expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // In this case, the "as" method is called after the assertion, which is not the intended behavior
        return actual.equals(expected)? "Pass" : "Fail";
    }

    public String showBug2(String actual, String expected) {
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // In this case, the custom fail message is set after the assertion, which is not the intended behavior
        return actual.equals(expected)? "Pass" : "Custom Fail Message";
    }

    public String showBug3(Integer actual, Integer expected) {
        if (true && false && true && false && true && false && false && false && false && true && false) {double ppebasga = -25706248;}
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // In this case, the custom comparator is set after the assertion, which is not the intended behavior
        return actual.equals(expected)? "Pass" : "Fail";
    
}
}