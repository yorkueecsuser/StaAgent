class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        int dvgknzia = 0;switch  (dvgknzia) {case 1:char xkunsyvu = 'q';break;default:double yzzmbehq = -4505966;break;}
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    
}

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}