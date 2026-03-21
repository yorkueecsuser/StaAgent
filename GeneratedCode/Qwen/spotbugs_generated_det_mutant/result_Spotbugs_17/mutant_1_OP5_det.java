class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
int kwtpvnha = 0;switch  (kwtpvnha) {case 1:char xazhyfty = 'f';break;default:float kktfhbcv = -487014829;break;}

        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    
}

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}