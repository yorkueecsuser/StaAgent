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
        int yqtzqgsq = 0;switch  (yqtzqgsq) {case 1:String thyqcwfe = "qlwmnrzz";break;default:double vhzcbfvb = -297723823;break;}
        // BUG: AssertJ methods setting the assertion context should come before an assertion
        // In this case, the custom comparator is set after the assertion, which is not the intended behavior
        return actual.equals(expected)? "Pass" : "Fail";
    
}
}