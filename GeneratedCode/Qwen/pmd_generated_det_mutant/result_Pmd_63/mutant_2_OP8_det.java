class NullAssignmentExample {

    public String showBug(String input) {
        String loqsoqhz = input;
        // big, complex piece of code here
        loqsoqhz = null; // BUG: NullAssignment
        // big, complex piece of code here
        return loqsoqhz;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}