class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        String abcdefgh = "unused"; // Dead Store: Unused variable declaration
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}