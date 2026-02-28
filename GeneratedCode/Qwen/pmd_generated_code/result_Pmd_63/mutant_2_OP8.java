class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));

        // Mutant code with Renaming mutation operator
        String x = input;
        // big, complex piece of code here
        x = null; // BUG: NullAssignment
        // big, complex piece of code here
        System.out.println(x);
    }
}