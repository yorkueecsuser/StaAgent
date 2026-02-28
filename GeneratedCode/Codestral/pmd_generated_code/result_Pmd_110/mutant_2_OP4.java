class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        // Added unreachable if-else statement
        if (isUnreachableCondition()) {
            System.out.println("Unreachable code");
        } else {
            // Alternative code that will not be executed
            System.out.println("Alternative code");
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }

    // Method that always returns false to make the if-else statement unreachable
    private static boolean isUnreachableCondition() {
        return false;
    }
}