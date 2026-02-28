class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        boolean shouldThrow = true;
        if (shouldThrow) {
            char c = myString.charAt(index);
            return c; // This will throw StringIndexOutOfBoundsException
        } else {
            // Do nothing
            // This is a unreachable statement
        }
        // Add a return statement to avoid compilation error
        return'';
    }
}