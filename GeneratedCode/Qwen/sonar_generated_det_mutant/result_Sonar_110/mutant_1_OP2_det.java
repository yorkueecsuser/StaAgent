class NullPointerExample {

    public String showBug(String input) {
        // BUG: Null pointers should not be dereferenced
        return input.toUpperCase(); // This line will throw a NullPointerException if input is null
    }
public static void main(String [] args){
    NullPointerExample example = new NullPointerExample();
    example = new NullPointerExample();
    try { System.out.println(example.showBug(null)); } catch(NullPointerException e){ System.err.println("Caught NullPointerException: " + e.getMessage()); }
}
}