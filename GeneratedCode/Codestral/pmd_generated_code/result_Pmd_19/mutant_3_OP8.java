class BrokenNullCheckBug {

    public String showBug(String string) {
        String s = string; // Renamed variable
        if (s!= null ||!s.equals(""))
            return s;
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will still throw NullPointerException
        System.out.println(result);
    }
}