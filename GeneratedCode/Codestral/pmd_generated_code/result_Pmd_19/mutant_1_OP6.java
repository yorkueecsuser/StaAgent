class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals("")) {
            boolean condition = false;
            for (int i = 0; condition; i++) {
                // Unreachable code
                System.out.println("This is an unreachable for loop");
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