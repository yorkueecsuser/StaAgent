class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        for (int i = 0; i < 0; i++) { // This is the unreachable for loop
            // Code here is unreachable as the loop is unreachable
        }

        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }
}