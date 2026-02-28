class StringBuilderInitWithCharBug {

    private boolean getCondition() {
        return false;
    }

    public StringBuilder showBug(char c) {
        StringBuilder sb = new StringBuilder(c);

        if (getCondition()) {
            System.out.println("This line will never execute");
        } else {
            int i = 10; // Added some code to make the else branch non-empty
        }

        return sb;
    }

    public static void main(String[] args) {
        StringBuilderInitWithCharBug bugDemo = new StringBuilderInitWithCharBug();
        StringBuilder sb = bugDemo.showBug('a');
        System.out.println("Length of StringBuilder: " + sb.length());
    }
}