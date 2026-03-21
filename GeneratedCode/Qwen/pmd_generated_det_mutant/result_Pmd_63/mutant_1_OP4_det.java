class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        if (true && true && true && true && true && false && true && false && true && true && false) {short yhomvklw = -2888;}else{short nowbolen = -2320;}
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    
}

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}