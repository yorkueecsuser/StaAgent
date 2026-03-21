class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        boolean pjvkgonf = false;while (pjvkgonf && true && false && false && false && false && true && false && false && true && true && false) {String xwaytfkx = "maofhwnd";}
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    
}

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}