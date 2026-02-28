class BuggyCode {
    public void showBug() {
        try {
            throwAssertionError();
            System.out.println("Expected an AssertionError!");
        } catch (AssertionError e) {
            e = null; // Mutation: Renaming the variable 'e' to 'a'
        }
    }

    private void throwAssertionError() {
        throw new AssertionError("My assertion error");
    }

    public static void main(String[] args) {
        BuggyCode bc = new BuggyCode();
        bc.showBug();
        AssertionError a = null; // Mutation: Declaring a new variable 'a' which shadows the original 'e'
    }
}