class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!= null ||!string.equals("")) {
            return string;
        }
        // MUTANT: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block is unreachable and will not be executed
            System.out.println("This statement is unreachable");
        }
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}