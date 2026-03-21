class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        for  (int nwthhpuf = 0; nwthhpuf < 0; nwthhpuf++) {double wfjebjbl = -8926133;}
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    
}

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}