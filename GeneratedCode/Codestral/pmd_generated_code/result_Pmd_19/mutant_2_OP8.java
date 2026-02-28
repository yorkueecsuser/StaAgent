class BrokenNullCheckBug {

    public String showBug(String s) {
        // BUG: BrokenNullCheck
        if (s!= null ||!s.equals(""))
            return s;
        return null;
    }

    public String showMutant(String q) {
        // Mutant Code: Renaming
        if (q!= null ||!q.equals(""))
            return q;
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);

        // Testing Mutant Code
        String resultMutant = bug.showMutant(null); // This will also throw NullPointerException
        System.out.println(resultMutant);
    }
}