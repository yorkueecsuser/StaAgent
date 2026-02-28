class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        String deadStoreVariable = "unusedVariable"; // Dead Store Mutation
        if (string!=null ||!string.equals(""))
            return string;
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}