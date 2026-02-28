class BrokenNullCheckBug {

    public String showBug(String string) {
        // BUG: BrokenNullCheck
        if (string!=null ||!string.equals("")) {
            int value = getUnreachableValue();
            switch(value) {
                case 1:
                    // unreachable code
                    break;
            }
            return string;
        }
        return null;
    }

    private int getUnreachableValue() {
        return -1; // This value will never be 1
    }

    public static void main(String[] args) {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        String result = bug.showBug(null); // This will throw NullPointerException
        System.out.println(result);
    }
}