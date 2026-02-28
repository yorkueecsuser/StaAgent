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

    public void mutatorMethod() {
        int value = 0; // false condition
        switch(value) {
            case 1: 
                System.out.println("Unreachable code");
                break;
            default:
                break; // Unreachable switch case
        }
    }
}