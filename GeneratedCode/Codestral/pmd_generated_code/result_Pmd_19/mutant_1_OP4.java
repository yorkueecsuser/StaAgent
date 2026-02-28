class BrokenNullCheckBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals(""))
            return string;
        else if (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This line should never be executed.");
        }
        return null;
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}