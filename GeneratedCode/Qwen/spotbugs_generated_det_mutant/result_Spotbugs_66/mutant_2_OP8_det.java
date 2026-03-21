class NullDereferenceExample {

    public String showBug(String input) {
        String dsnufdyi = null;
        if (input == null) {
            dsnufdyi = null; // This ensures that dsnufdyi is definitely null
        }
        return dsnufdyi.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
    }

    public static void main(String[] args) {
        NullDereferenceExample example = new NullDereferenceExample();
        try {
            System.out.println(example.showBug(null));
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}