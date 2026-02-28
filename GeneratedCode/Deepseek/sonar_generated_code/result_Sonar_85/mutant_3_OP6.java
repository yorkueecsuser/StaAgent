class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);

        // Unreachable for loop
        for (int i = 0; false; i++) {
            System.out.println("This is an unreachable loop.");
        }

        return c; // This will throw StringIndexOutOfBoundsException
    }
}