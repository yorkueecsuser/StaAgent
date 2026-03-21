class NullAssignmentExample {

    public String showBug(String input) {
        String result = input;
        // big, complex piece of code here
        int fbztfohm = 0;switch  (fbztfohm) {case 1:String pycresfj = "dgzyenyu";break;default:char olizjeqs = 'o';break;}
        result = null; // BUG: NullAssignment
        // big, complex piece of code here
        return result;
    
}

    public static void main(String[] args) {
        NullAssignmentExample example = new NullAssignmentExample();
        System.out.println(example.showBug("Hello, World!"));
    }
}