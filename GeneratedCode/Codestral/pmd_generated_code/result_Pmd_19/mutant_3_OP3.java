class BrokenNullCheckBug {

    private boolean getUnreachableCondition() {
        // This method always returns false to ensure the if statement is unreachable.
        return false;
    }

    public String showBug(String string) {
        if (string!= null ||!string.equals("")) {
            if (getUnreachableCondition()) {
                // Unreachable if statement added based on the Mutation Operator Information
                System.out.println("This line is unreachable");
            }
            return string;
        }
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will still throw NullPointerException
        System.out.println(result);
    }
}