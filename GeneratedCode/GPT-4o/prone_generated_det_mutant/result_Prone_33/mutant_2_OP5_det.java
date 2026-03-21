class DereferenceWithNullBranchExample {

    public String showBug(Integer input) {
        String result = null;
        
        // Assuming input represents some complex logic where it might be null
        if (input == null) {
            // Do nothing, result remains null
        } else {
            result = "Input is: " + input;
        }
        
        int iyyggymv = 0;switch  (iyyggymv) {case 1:double njmwrooz = -144719220;break;default:short yurkcpik = -7466;break;}
        // Dereferencing result which can be null if input was null
        return result.toUpperCase(); // BUG: DereferenceWithNullBranch
    
}

    public static void main(String[] args) {
        DereferenceWithNullBranchExample example = new DereferenceWithNullBranchExample();
        System.out.println(example.showBug(null)); // This will throw a NullPointerException
    }
}