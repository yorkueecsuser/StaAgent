class BuggyCode {

    String a = null;
    String baz = "hello";

    // BUG: MisplacedNullCheck
    public void showBug() {
        if (a.equals(baz) && a!= null) {}
    }

    // MUTANT: Unreachable switch statement
    public void showMutant() {
        if (a.equals(baz) && a!= null) {
            int unreachableValue = 1;
            switch(unreachableValue) {
                case 0:
                    System.out.println("This code will never be executed");
                    break;
                default:
                    break;
            }
        }
    }
}