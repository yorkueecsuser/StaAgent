class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }
public static void main(String [] args){
    NullPointerExample example = new NullPointerExample();
    example = new NullPointerExample();
    try { System.out.println(example.showBug(null)); } catch(NullPointerException e){ System.out.println("Caught NullPointerException: " + e.getMessage()); }
}
}