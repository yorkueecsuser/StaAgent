class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            boolean condition = false;
            while (condition) {
                // This while loop is unreachable as the condition is always false
                System.out.println("This is an unreachable while loop");
            }
            return "A. O. K.";
        }
    }

    public String showBug() {
        return foo();
    }
}