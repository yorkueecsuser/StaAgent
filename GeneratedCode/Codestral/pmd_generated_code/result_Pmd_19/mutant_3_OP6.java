class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        boolean condition = getCondition();
        if (string!= null ||!string.equals("")) {
            // Mutation: Unreachable for loop
            for (int i = 0; condition; i++) {
                System.out.println("This line will never be executed");
            }
            return string;
        }
        return null;
    }

    private boolean getCondition() {
        // This method returns false to make the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}