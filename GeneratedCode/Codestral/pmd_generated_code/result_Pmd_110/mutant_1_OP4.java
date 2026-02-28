class InsufficientStringBufferDeclarationBug {
    public boolean getCondition() {
        return false; // Dynamically determined condition that is always false
    }

    public void showBug() {
        StringBuilder bad = new StringBuilder();
        bad.append("This is a long string that will exceed the default 16 characters");

        // Mutant code: Unreachable if-else statement
        if (getCondition()) {
            System.out.println("This line is unreachable");
        } else {
            System.out.println(bad.toString());
        }
    }

    public static void main(String[] args) {
        InsufficientStringBufferDeclarationBug bug = new InsufficientStringBufferDeclarationBug();
        bug.showBug();
    }
}