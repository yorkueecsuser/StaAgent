class StringOperationsBug {

    public boolean showBug1(String input) {
        // Checking if a string contains itself
        return input.contains(input); // BUG: String operations with predictable outcomes should be avoided
    }

    public boolean showBug2(String input) {
        // Comparing a string with itself
        return input.equals(input); // BUG: String operations with predictable outcomes should be avoided
    }

    public boolean showBug3(String input) {
        // Matching a string against itself
        return input.matches(input); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug4(String input) {
        // Creating a substring from 0 to the end of the string
        return input.substring(0, input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug5(String input) {
        // Creating a substring from the end of the string
        return input.substring(input.length()); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug6(String input) {
        // Replacing a string with itself
        return input.replace(input, input); // BUG: String operations with predictable outcomes should be avoided
    }

    public String showBug7(String input) {
        // Replacing a substring with the exact substring
        return input.replace("a", "a"); // BUG: String operations with predictable outcomes should be avoided
    }
public static void main(String [] args){
    StringOperationsBug bugDemo = new StringOperationsBug();
    bugDemo = new StringOperationsBug();
    System.out.println(bugDemo.showBug1("example"));
    System.out.println(bugDemo.showBug2("example"));
    System.out.println(bugDemo.showBug3("example"));
    System.out.println(bugDemo.showBug4("example"));
    System.out.println(bugDemo.showBug5("example"));
    System.out.println(bugDemo.showBug6("example"));
    System.out.println(bugDemo.showBug7("example"));
}
}