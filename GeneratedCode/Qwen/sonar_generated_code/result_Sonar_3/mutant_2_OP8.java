class StringIndexOfBug {

    // Method to demonstrate the bug with incorrect range usage
    public int showBug1(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);
    }

    // Method to demonstrate the bug with incorrect range usage (mutant)
    public int showBug1a(String str, String x, int b, int e) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(x, b, e);
    }

    // Method to demonstrate the bug with negative beginIndex
    public int showBug2(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, beginIndex, endIndex);
    }

    // Method to demonstrate the bug with negative beginIndex (mutant)
    public int showBug2b(String s, String w, int bi, int ei) {
        // BUG: "String.indexOf" should be used with correct ranges
        return s.indexOf(w, bi, ei);
    }

    // Method to demonstrate the bug with reversed beginIndex and endIndex
    public int showBug3(String str, String what, int beginIndex, int endIndex) {
        // BUG: "String.indexOf" should be used with correct ranges
        return str.indexOf(what, endIndex, beginIndex);
    }

    // Method to demonstrate the bug with reversed beginIndex and endIndex (mutant)
    public int showBug3c(String t, String q, int i, int j) {
        // BUG: "String.indexOf" should be used with correct ranges
        return t.indexOf(q, j, i);
    }

    public static void main(String[] args) {
        StringIndexOfBug bugDemo = new StringIndexOfBug();
        
        // Demonstrating bug with incorrect range usage
        try {
            System.out.println(bugDemo.showBug1("Hello World", "World", 7, 2)); // Incorrect range
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with incorrect range usage (mutant)
        try {
            System.out.println(bugDemo.showBug1a("Hello World", "World", 7, 2)); // Incorrect range
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with negative beginIndex
        try {
            System.out.println(bugDemo.showBug2("Hello World", "World", -1, 5)); // Negative beginIndex
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with negative beginIndex (mutant)
        try {
            System.out.println(bugDemo.showBug2b("Hello World", "World", -1, 5)); // Negative beginIndex
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with reversed beginIndex and endIndex
        try {
            System.out.println(bugDemo.showBug3("Hello World", "World", 12, 7)); // Reversed indices
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Demonstrating bug with reversed beginIndex and endIndex (mutant)
        try {
            System.out.println(bugDemo.showBug3c("Hello World", "World", 12, 7)); // Reversed indices
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}