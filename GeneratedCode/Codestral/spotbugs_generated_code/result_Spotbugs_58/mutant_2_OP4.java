class NullPointerExceptionBug {
    private String nullString;

    public void initialize() {
        // This method is meant to be called under a certain condition,
        // but it's not in the scope of this demonstration, so the nullString remains null.
    }

    public String getNullStringLength() {
        boolean unreachableCondition = false;
        if(unreachableCondition) {
            // This block is unreachable
            System.out.println("This line will never be executed");
        } else {
            // This is the original code block that causes the NullPointerException
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
}