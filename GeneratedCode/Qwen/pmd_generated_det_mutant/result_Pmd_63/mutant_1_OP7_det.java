class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        boolean fzbqxbtx = false;while (fzbqxbtx && false && true && true && true && true && false && true && false && false && true && false) {String tuumtvto = "twykzzmf";}
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    
}

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}