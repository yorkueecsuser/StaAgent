class BuggyCode {
    public static void main(String[] args) {
        showBug();
    }

    public static char showBug() {
        String myStr = "Hello World";
        int index = 11; // index is out of bounds
        char c = myStr.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }
}