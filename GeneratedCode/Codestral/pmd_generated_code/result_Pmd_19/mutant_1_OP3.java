class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!= null ||!string.equals(""))
            return string;

        // Mutant: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable
            System.out.println("This is an unreachable branch");
        }

        return null;
    }

    public boolean getUnreachableCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}