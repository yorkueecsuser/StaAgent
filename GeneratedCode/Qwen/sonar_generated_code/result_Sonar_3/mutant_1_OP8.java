class StringIndexOfBug {

    // Method to demonstrate the bug with incorrect range usage
    public int showBug1(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);
    }

    // Method to demonstrate the bug with incorrect range usage with mutant
    public int showBug1Mutant(String str, String what, int a, int b) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, a, b);
    }

    // Method to demonstrate the bug with negative beginIndex
    public int showBug2(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);
    }

    // Method to demonstrate the bug with negative beginIndex with mutant
    public int showBug2Mutant(String str, String what, int c, int d) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, c, d);
    }

    // Method to demonstrate the bug with reversed beginIndex and endIndex
    public int showBug3(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, endIndex, beginIndex);
    }

    // Method to demonstrate the bug with reversed beginIndex and endIndex with mutant
    public int showBug3Mutant(String str, String what, int e, int f) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, f, e);
    }

    public static void main(String[] args) {
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        
        // Demonstrating bug with incorrect range usage
        try {
            System.out.println(bugDemo.showBug1("Hello World", "World", 7, 2)); // Incorrect range
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }

        // Demonstrating bug with incorrect range usage with mutant
        try {
            System.out.println(bugDemo.showBug1Mutant("Hello World", "World", 7, 2)); // Incorrect range
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }

        // Demonstrating bug with negative beginIndex
        try {
            System.out.println(bugDemo.showBug2("Hello World", "World", -1, 5)); // Negative beginIndex
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }

        // Demonstrating bug with negative beginIndex with mutant
        try {
            System.out.println(bugDemo.showBug2Mutant("Hello World", "World", -1, 5)); // Negative beginIndex
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }

        // Demonstrating bug with reversed beginIndex and endIndex
        try {
            System.out.println(bugDemo.showBug3("Hello World", "World", 12, 7)); // Reversed indices
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }

        // Demonstrating bug with reversed beginIndex and endIndex with mutant
        try {
            System.out.println(bugDemo.showBug3Mutant("Hello World", "World", 12, 7)); // Reversed indices
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("Caught exception: " + ex.getMessage());
        }
    }
}