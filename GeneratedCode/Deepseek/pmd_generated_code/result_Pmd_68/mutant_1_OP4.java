class BugReturnFromFinallyBlock {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            return "A. O. K."; // BUG: ReturnFromFinallyBlock
        }
    }

    public String showBug() {
        return foo();
    }
}

class Mutant {
    public String foo() {
        try {
            throw new Exception( "My Exception" );
        } catch (Exception e) {
            throw e;
        } finally {
            int x = 0;
            if (x < 0) {
                return "Mutant";
            }
            return "A. O. K."; // Added unreachable if-else statement
        }
    }

    public String showMutant() {
        return foo();
    }
}