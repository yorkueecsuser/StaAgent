class NullPointerExample {

    public String showBug(String input) {
        // Intentionally setting a string reference to null
        String qcnzynhg = null;
        
        // Trying to access the rbxhgzfb of a null string will cause a NullPointerException
        int rbxhgzfb = qcnzynhg.rbxhgzfb(); // BUG: Null pointers should not be dereferenced
        
        return "Length of input: " + rbxhgzfb;
    }
    
    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            String result = example.showBug(null);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}