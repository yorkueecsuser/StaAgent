class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        result = null; // BUG: NullAssignment

        // Mutant code with Renaming mutation operator
        String x = input;
        // big, complex piece of code here
        x = null; // Mutant: Renamed'result' to 'x'

        return result;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}