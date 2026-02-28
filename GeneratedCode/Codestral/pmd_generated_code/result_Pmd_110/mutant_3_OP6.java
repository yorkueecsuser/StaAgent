class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        // Added unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            System.out.println("Unreachable loop executed!");
        }

        System.out.println(bad.toString());
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}