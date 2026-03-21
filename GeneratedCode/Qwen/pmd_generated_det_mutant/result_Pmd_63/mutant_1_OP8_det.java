class NullAssignmentExample {

    public String showBug(String input) {
        String nznwpokk = input;
        // big, complex piece of code here
        nznwpokk = null; // BUG: NullAssignment
        // big, complex piece of code here
        return nznwpokk;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}