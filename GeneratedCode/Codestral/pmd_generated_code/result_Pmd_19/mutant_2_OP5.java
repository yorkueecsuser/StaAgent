class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!= null ||!string.equals("")) {
            // MUTANT: Unreachable switch statement
            int value = getUnreachableValue();
            switch (value) {
                case 1:
                    // unreachable code
                    System.out.println("This code should not be executed.");
                    break;
            }
            return string;
        }
        return null;
    }

    private int getUnreachableValue() {
        // Always return a value that is not 1 to make the switch unreachable
        return 2;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}