class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
    }

    // MUTANT CODE: Unreachable while loop
    public void mutantShowBug() {
        boolean conditionWhile = false;
        while (conditionWhile) { 
            // Unreachable code
            int unreachable = 1;
            unreachable++;
        }
        if (a.equals(baz) && a!= null) {}
    }
}