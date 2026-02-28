class StringIndexOfBug {

    // Method to demonstrate the bug with incorrect range usage
    public int showBug1(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in showBug1");
        }
    }

    // Method to demonstrate the bug with negative beginIndex
    public int showBug2(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in showBug2");
        }
    }

    // Method to demonstrate the bug with reversed beginIndex and endIndex
    public int showBug3(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, endIndex, beginIndex);

        // Inserting unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in showBug3");
        }
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

        // Inserting unreachable while loop in main
        boolean conditionWhileMain = getCondition();
        while (conditionWhileMain) {
            // Unreachable code
            System.out.println("This is an unreachable loop in main");
        }
    }

    // Method to provide a dynamic condition for the while loop
    private static boolean getCondition() {
        return false; // This will always return false, but the compiler cannot determine this at compile time
    }
}