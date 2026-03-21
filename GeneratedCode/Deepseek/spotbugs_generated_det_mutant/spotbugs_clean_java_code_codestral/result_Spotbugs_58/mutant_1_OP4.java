class NullPointerExceptionBug {
    private String nullString;

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        boolean unreachableCondition = getCondition(); // this method will return false
        if(unreachableCondition) {
            // this branch is unreachable, so any code here will not be executed
            int a = 10;
            System.out.println("This statement should never be printed");
        } else {
            // this is the original code, which will throw a NullPointerException
            return "Length: " + nullString.length();
        }
    }

    public void showBug() {
        initialize();
        System.out.println(getNullStringLength()); // This will throw a NullPointerException
    }

    public static void main(String[] args) {
        NullPointerExceptionBug bug = new NullPointerExceptionBug();
        bug.showBug();
    }

    private boolean getCondition() {
        return false;
    }
}