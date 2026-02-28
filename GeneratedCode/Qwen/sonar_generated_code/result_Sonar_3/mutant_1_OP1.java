class StringIndexOfBug {

    // Method to demonstrate the bug with incorrect range usage
    public int showBug1(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        intabcdefgh = 42; // Dead store
        return str.indexOf(what, beginIndex, endIndex);
    }

    // Method to demonstrate the bug with negative beginIndex
    public int showBug2(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        Stringabcdefgh = "unused"; // Dead store
        return str.indexOf(what, beginIndex, endIndex);
    }

    // Method to demonstrate the bug with reversed beginIndex and endIndex
    public int showBug3(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        booleanabcdefgh = true; // Dead store
        return str.indexOf(what, endIndex, beginIndex);
    }

    public static void main(String[] args) {
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        
        // Demonstrating bug with incorrect range usage
        try {
            System.out.println(bugDemo.showBug1("Hello World", "World", 7, 2)); // Incorrect range
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with negative beginIndex
        try {
            System.out.println(bugDemo.showBug2("Hello World", "World", -1, 5)); // Negative beginIndex
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with reversed beginIndex and endIndex
        try {
            System.out.println(bugDemo.showBug3("Hello World", "World", 12, 7)); // Reversed indices
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}