class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        String a = result; // Renamed variable
        a = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}