class BuggyCode {

    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);
        String unusedVariable = "abcdefgh"; // Dead Store Mutation Operator
        return c; // This will throw StringIndexOutOfBoundsException
    }
}