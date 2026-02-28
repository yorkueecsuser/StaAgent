class InsufficientStringBufferDeclarationBug {
    public void showBug() {
        StringBuilder bad = new StringBuilder(); // BUG: InsufficientStringBufferDeclaration
        bad.append("This is a long string that will exceed the default 16 characters");

        // MUTATION: Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // Assume getCondition() method exists and returns false
        while (conditionWhile) {
            System.out.println("This line will never be executed");
        }

        System.out.println(bad.toString());
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }

    // Method to return false for unreachable while loop
    private boolean getCondition() {
        return false;
    }
}