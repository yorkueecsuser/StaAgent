class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals("")) {
            boolean unreachableCondition = getUnreachableCondition();
            while (unreachableCondition) {
                // Unreachable while loop inserted per the mutation operator
            }
            return string;
        }
        return null;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}