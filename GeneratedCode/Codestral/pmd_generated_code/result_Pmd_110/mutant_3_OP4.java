class InsufficientStringBufferDeclarationBug {
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        boolean shouldRun = getFalseCondition();
        if (shouldRun) {
            System.out.println("This line will never be printed.");
        } else {
            System.out.println(bad.toString());
        }
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}