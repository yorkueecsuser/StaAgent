class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!= null ||!string.equals("")) {
            boolean unreachableCondition = getCondition();
            for (int i = 0; unreachableCondition; i++) {
                // This code will never be reached
                System.out.println("This is an unreachable loop.");
            }
            return string;
        }
        return null;
    }

    public static boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}