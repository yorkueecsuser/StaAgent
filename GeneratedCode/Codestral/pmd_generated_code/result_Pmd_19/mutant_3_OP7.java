class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!= null ||!string.equals("")) {
            boolean conditionWhile = false;
            while (conditionWhile) {
                System.out.println("This line will never execute");
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