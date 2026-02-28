class BrokenNullCheckBug {
    private static boolean getCondition() {
        return false; // This method always returns false to make the if-else branch unreachable
    }

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!= null ||!string.equals(""))
            return string;

        // Mutant: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line will never be executed");
            return "This value will never be returned";
        }

        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}