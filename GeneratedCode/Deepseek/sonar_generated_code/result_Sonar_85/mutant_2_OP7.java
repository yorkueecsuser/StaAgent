class BuggyCode {
    public static void main(String[] args) {
        showBug();
        boolean condition = true;
        while (condition) {
            System.out.println("This is a unreachable while loop");
        }
    }

    public static char showBug() {
        String myString = "Hello World";
        int index = 11; // index is out of bounds
        char c = myString.charAt(index);
        return c; // This will throw StringIndexOutOfBoundsException
    }
}