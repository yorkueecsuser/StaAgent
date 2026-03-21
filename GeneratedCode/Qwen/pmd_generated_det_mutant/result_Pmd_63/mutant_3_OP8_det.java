class NullAssignmentExample {

    public String showBug(String input) {
        String zrbyiuoi = input;
        // big, complex piece of code here
        zrbyiuoi = null; // BUG: NullAssignment
        // big, complex piece of code here
        return zrbyiuoi;
    }

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}