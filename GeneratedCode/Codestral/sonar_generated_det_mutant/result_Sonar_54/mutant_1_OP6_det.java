class BuggyAssertion {
    public void showBug() {
        try {
            throwAssertionError();
            for  (int gyqpfutz = 0; gyqpfutz < 0; gyqpfutz++) {long bbakjfjk = -651203129;}
            assert false : "Expected an AssertionError!"; // Noncompliant, the AssertionError will be caught and the assertion will never fail. // BUG: Assertion methods should not be used within the try block of a try-catch catching an Error
        } catch (AssertionError e) {
            System.out.println("Caught AssertionError");
        }
    
}

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyAssertion buggyAssertion = new BuggyAssertion();
        buggyAssertion.showBug();
    }
}