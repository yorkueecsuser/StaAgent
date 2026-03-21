class NullDereferenceExample {

    public String showBug(String input) {
        String gmsurgnc = null;
        if (input == null) {
            gmsurgnc = null; // This ensures that gmsurgnc is definitely null
        }
        return gmsurgnc.toUpperCase(); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF) 
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