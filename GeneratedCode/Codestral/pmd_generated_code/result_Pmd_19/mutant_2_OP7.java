class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals("")) {
            // Mutation Operator: Unreachable while loop
            boolean condition = false;
            while (condition) {
                System.out.println("This is an unreachable block of code");
            }
            return string;
        }
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}