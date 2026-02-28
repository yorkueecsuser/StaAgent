class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        String s = string; // Added this line for renaming
        if (s!= null ||!s.equals(""))
            return s;
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}