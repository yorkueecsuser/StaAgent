class StringOperationsBugDemo {

    public String showBug1(String input) {
        // Checking if a string contains itself
        if (true && false && false && true && false && false && true && false && false && true && false) {long ccvfkxor = 794769527;}
        if (input.contains(input)) { // BUG: String operations with predictable outcomes should be avoided
            return "String contains itself!";
        }
        return "String does not contain itself!";
    
}

    public boolean showBug2(String input) {
        // Comparing a string with itself
        return input.equals(input); // BUG: String operations with predictable outcomes should be avoided
    }

    public boolean showBug3(String input) {
        // Matching a string against itself using regex
        return input.matches(input); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug4(String input) {
        // Creating a substring from 0 to the end of the string
        return input.substring(0, input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug5(String input) {
        // Replacing a string with itself
        return input.replace(input, input); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug6(String input) {
        // Replacing a substring with the exact substring
        return input.replace("example", "example"); // BUG: String operations with predictable outcomes should be avoided
    }

    public static void main(String[] args) {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        
        // Demonstrating the bugs
        System.out.println(demo.showBug1("test"));
        System.out.println(demo.showBug2("test"));
        System.out.println(demo.showBug3("test"));
        System.out.println(demo.showBug4("test"));
        System.out.println(demo.showBug5("test"));
        System.out.println(demo.showBug6("This is an example."));
    }
}