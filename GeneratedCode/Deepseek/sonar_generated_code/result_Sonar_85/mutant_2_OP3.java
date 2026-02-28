class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            char c = myString.charAt(index);
            return c; // This will throw StringIndexOutOfBoundsException
        }
        return''; // This will make the if branch unreachable
    }
}