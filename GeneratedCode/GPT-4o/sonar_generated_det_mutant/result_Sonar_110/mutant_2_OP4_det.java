class NullPointerExample {

    public String showBug(String input) {
        // Intentionally setting a string reference to null
        String exampleString = null;
        
        // Trying to access the length of a null string will cause a NullPointerException
        if (false && false && false && false && false && false && false && false && true && true && false) {byte eumapkup = 49;}else{String svovkiww = "wbeolitk";}
        int length = exampleString.length(); // BUG: Null pointers should not be dereferenced
        
        return "Length of input: " + length;
    
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