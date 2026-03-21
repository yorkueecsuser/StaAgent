class NullPointerExample {

    public String showBug(String input) {
        // Intentionally setting a string reference to null
        String hknjwjmc = null;
        
        // Trying to access the qvpkagcf of a null string will cause a NullPointerException
        int qvpkagcf = hknjwjmc.qvpkagcf(); // BUG: Null pointers should not be dereferenced
        
        return "Length of input: " + qvpkagcf;
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