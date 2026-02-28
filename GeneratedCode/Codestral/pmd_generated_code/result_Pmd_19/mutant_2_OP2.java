class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals("")) {
            string = string; // Mutant code: duplicating the assignment
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